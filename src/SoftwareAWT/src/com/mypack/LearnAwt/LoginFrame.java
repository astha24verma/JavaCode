package com.mypack.LearnAwt;

import java.awt.*;

public class LoginFrame extends Frame{
    Label l1, l2;
    TextField t1, t2;
    Button b1, b2;
    LoginFrame() {                      //constructor ; so that no method calling of LoginFrame is required
        setTitle("Login Window");
        setVisible(true);
        setSize(250, 300);
        setBackground(Color.orange);
        setLocation(500, 100);
        l1 = new Label("Username : ");
        l2 = new Label("Password : ");
        t1 = new TextField(15);       //allows to enter 15 characters
        t2 = new TextField(15);
        t2.setEchoChar('*');
        b1 = new Button("SUBMIT");
        b2 = new Button("RESET");
        setLayout(new FlowLayout());
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
        add(b2);
    }

    public static void main(String[] args) {
        new LoginFrame();
    }

}
