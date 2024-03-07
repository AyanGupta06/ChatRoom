package src;
import java.io.*;
import java.net.*;
import java.util.*;

public class ClientMain {
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name:");
            String name
            Socket socket = new Socket("127.0.0.1", 8001);
            ObjectInputStream is = new ObjectInputStream(socket.getInputStream());
            ObjectOutputStream os = new ObjectOutputStream(socket.getOutputStream());
            CommandFromServer cfs = (CommandFromServer) is.readObject();
            ButtonFrame frame;
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
