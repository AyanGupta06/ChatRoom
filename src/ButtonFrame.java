package src;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.ObjectOutputStream;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;
public class ButtonFrame extends JFrame{
    private String user;
    private ObjectOutputStream os;
    JList list = new JList();
    JLabel chat = new JLabel("Chat");
    JLabel users = new JLabel("Users");
    JButton send = new JButton("Send");
    JButton exit = new JButton("Exit");
    JTextArea message = new JTextArea("");
    JTextArea msgsfield = new JTextArea ("");
    JList listUsers = new JList();
    JScrollPane scrollUsers = new JScrollPane(listUsers, JScrollPane.VERTICAL_SCROLLBAR_NEVER, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

    JScrollPane scroll = new JScrollPane (list, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);

    public ButtonFrame(ObjectOutputStream os, String user) {
        super("Chat Room");
        this.os = os;
        this.user = user;

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        setSize(600, 600);
        setResizable(false);
        setAlwaysOnTop(true);
        setVisible(true);
        send.setBounds(20, 20, 50, 50);


        add(list);
        add(chat);
        add(users);
        add(send);
        add(exit);
        add(message);
        add(msgsfield);
        add(listUsers);
        add(scrollUsers);
        add(scroll);

    }
}
