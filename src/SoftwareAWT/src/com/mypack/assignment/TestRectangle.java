//17.0  Create a class Rectangle with attributes length and width, each of which defaults to 1.
//        Provide methods that calculate the rectangle’s perimeter and area. It has set and get methods for
//        both length and width. The set methods should verify that length and width are each floating point
//        numbers larger than 0.0 and less than 20.0. Write a program to test class Rectangle.
package com.mypack.assignment;

import java.util.Scanner;

class Rectangle{
    float length, width;

    public Rectangle(){
        this.length = 1.0f;
        this.width = 1.0f;
    }

    public void setLength(float l){
        if (l > 0.0 && l < 20.0){
            this.length = l;
        }
    }
    public float getLength(){
        return length;
    }
    public void setWidth(float b){
        if (b > 0.0 && b < 20.0){
            this.width = b;
        }
    }
    public float getWidth(){
        return width;
    }

    public float perimeter(){
        float peri = (2*(length + width));
        return peri;
    }

    public float area(){
        float ar = (length * width);
        return ar;
    }


}
public class TestRectangle {
    public static void main(String[] args) {
        float l, b;
        Scanner sc = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        System.out.print("Enter length (1 to 19) : ");
        l = sc.nextFloat();
        System.out.print("Enter Width (1 to 19) : ");
        b = sc.nextFloat();
        r1.setLength(l);
        r1.setWidth(b);
        System.out.println("Perimeter of Rectangle : "+r1.perimeter());
        System.out.println("Area of Rectangle : "+r1.area());

    }
}
