//Task 1: WAP to create a Button that show “CLICK HERE”
//        after click on this button, it shows “Its Clicked….”
package com.mypack.LearnAwt;

import java.awt.*;
import java.awt.event.*;

public class ButtonClick extends Frame implements ActionListener{
    Button b1;

    ButtonClick() {
        setTitle("Click Me");
        setSize(200, 100);
        setLocation(200,200);
        setVisible(true);
        setFont(new Font("Arial Black", Font.BOLD, 16));

        b1 = new Button("CLICK HERE");
        add(b1);
        b1.addActionListener(this);
    }


    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==b1){
            b1.setLabel("Its Clicked...");
        }

    }

    public static void main(String[] args) {
        new ButtonClick();
    }
}



