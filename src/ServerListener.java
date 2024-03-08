package src;
import java.io.*;
import java.util.*;
public class ServerListener implements Runnable{
    private ObjectInputStream is;
    private ObjectOutputStream os;
    private static ArrayList<ObjectOutputStream> outs = new ArrayList<>();

    public ServerListener(ObjectInputStream is, ObjectOutputStream os){
        this.is = is;
        this.os = os;
        outs.add(os);
    }
    @Override
    public void run(){
        try{
            while(true){
                CommandFromClient cfc = (CommandFromClient) is.readObject();
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
