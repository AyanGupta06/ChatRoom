package src;
import java.net.*;
import java.io.*;

public class ServerMain {
    public static void main(String[] args){
        try{
            ServerSocket serverSocket = new ServerSocket(8001);
            while(true){
                Socket socket = serverSocket.accept();
                ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                ServerListener sl = new ServerListener(ois, oos);
                Thread t = new Thread(sl);
                t.start();
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
