//29.0  Write a program that creates an abstract class called Dimension creates two sub classes, Rectangle
//        and Triangle. Include appropriate methods for both sub classes that calculate and display the area of
//        Rectangle and Triangle.
package com.mypack.assignment;

abstract class Dimension{
    abstract public void area(int x, int y);
}

class Rectangle2 extends Dimension{
    public void area(int l, int b){
        System.out.println("Area of Rectangle : "+ l*b);
    }
}

class Triangle extends Dimension{
    public void area(int b, int h){
        System.out.println("Area of Rectangle : "+ 0.5*b*h);
    }
}

public class TestDimensions {
    public static void main(String[] args) {
        new Rectangle2().area(12, 7);
        new Triangle().area(5, 8);
        // Abstract Class's reference variable ---> r1
        Dimension r1 = new Rectangle2();
        r1.area(9, 5);
    }
}
