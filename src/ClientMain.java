package src;
import java.io.*;
import java.net.*;
import java.util.*;

public class ClientMain {
    private static ArrayList<String> names = new ArrayList<>();
    public static void main(String[] args){
        try{
            String name;
            Scanner sc = new Scanner(System.in);
            while(true){
                System.out.println("Enter your name:");
                name = sc.nextLine();
                if(!names.contains(name)){
                    break;
                }
            }
            System.out.println("Enter the ip address of the server:");
            String ip = sc.nextLine();
            Socket socket = new Socket(ip, 8001);
            ObjectInputStream is = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream os = new ObjectOutputStream(socket.getOutputStream());
            ButtonFrame frame = new ButtonFrame(os, name);

            ClientListener cl = new ClientListener(is, os, frame);
            Thread t = new Thread(cl);
            t.start();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
