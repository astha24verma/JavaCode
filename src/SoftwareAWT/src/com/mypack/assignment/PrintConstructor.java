//24.0:  Write a program simply prints ―An Constructor automatically invoked when its object is
//        created‖ Without using any print or concrete methods or dot operator inside the main method.
 package com.mypack.assignment;

public class PrintConstructor {

    public PrintConstructor(){
        System.out.println("An Constructor automatically invoked when its object is created");
    }

    public static void main(String[] args) {
        PrintConstructor obj = new PrintConstructor();
    }
}
