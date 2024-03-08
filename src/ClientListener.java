package src;
import java.awt.*;
import java.io.*;
public class ClientListener implements Runnable{
    private ObjectOutputStream os;
    private ObjectInputStream is;
    private ButtonFrame frame;

    public ClientListener(ObjectInputStream is, ObjectOutputStream os, ButtonFrame frame){
        this.is = is;
        this.os = os;
        this.frame = frame;
    }
    @Override
    public void run(){
        try{
            while(true){
                CommandFromServer cfs = (CommandFromServer) is.readObject();
            }
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}
