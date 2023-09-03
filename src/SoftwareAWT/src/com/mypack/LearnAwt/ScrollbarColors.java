package com.mypack.LearnAwt;

import java.awt.*;
import java.awt.event.*;


public class ScrollbarColors extends Frame implements AdjustmentListener{
    Scrollbar red,green,blue;
    Label l1,l2,l3;
    ScrollbarColors()
    {
        setTitle("ScrollBar Example");
        l1=new Label("Red");
        l2=new Label("Green");
        l3=new Label("Blue");
        red=new Scrollbar(Scrollbar.HORIZONTAL,1,1,0,255);
        green=new Scrollbar(Scrollbar.HORIZONTAL,1,1,0,255);
        blue=new Scrollbar(Scrollbar.HORIZONTAL,1,1,0,255);
        setLayout(null);
        add(l1);
        add(l2);
        add(l3);
        add(red);
        add(green);
        add(blue);
        l1.setBounds(50,100,50,30);
        red.setBounds(110,100,250,30);
        l2.setBounds(50,150,50,30);
        green.setBounds(110,150,250,30);
        l3.setBounds(50,200,50,30);
        blue.setBounds(110,200,250,30);
        red.addAdjustmentListener(this);
        green.addAdjustmentListener(this);
        blue.addAdjustmentListener(this);
        setSize(1000,700);
        setVisible(true);
    }
    public void adjustmentValueChanged(AdjustmentEvent ae)
    {
        int r,g,b;
        r=red.getValue();
        g=green.getValue();
        b=blue.getValue();
        Color color=new Color(r,g,b);
        setBackground(color);
        setTitle("Red:"+r+" Green:"+g+" Blue:"+b);
    }
    public static void main(String args[])
    {
        new ScrollbarColors();
    }
}
