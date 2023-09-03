package com.mypack.LearnAwt;

import java.awt.*;

class MyFrame1 extends Frame{
    MyFrame1(){
        setVisible(true);
        setSize(800,400);
        setBackground(Color.orange);
        setForeground(Color.white);
        setTitle("Welcome to Frame");

    }

}
public class AwtFrameF1 {
    public static void main(String[] args) {
//        MyFrame f =
        new MyFrame1();
    }
}
