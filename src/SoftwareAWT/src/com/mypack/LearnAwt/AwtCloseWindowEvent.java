package com.mypack.LearnAwt;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AwtCloseWindowEvent extends Frame implements WindowListener {
    AwtCloseWindowEvent(){
        setTitle("Window");
        setVisible(true);
        setSize(400,300);
        setLocation(400, 200);
        setBackground(Color.pink);
        addWindowListener(this);
    }

    public static void main(String[] args) {
        new AwtCloseWindowEvent();
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}
