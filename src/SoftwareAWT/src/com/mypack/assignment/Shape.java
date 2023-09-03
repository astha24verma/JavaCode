//32.0: Create a base class called Shape. It contain two methods getxyvalue () and showxyvalue ()
//        for accept coordinates and to display the same. Create a subclass called Rectangle. It also contain
//        a method to display the length and breadth of rectangle called showxyvalue () using overriding
//        concept
package com.mypack.assignment;

import java.util.Scanner;

class Rectangle3 extends Shape{
    public void showxyvalue(){
        System.out.println("Length of rectangle : "+this.x+" and breadth of rectangle :"+this.y);
    }
}

public class Shape {
    int x,y;
    public void getxyvalue(int x, int y){
        this.x = x;
        this.y = y;
    }
    public void showxyvalue(){
        System.out.println("x axis : "+this.x+" & y axis :"+this.y);
    }

    public static void main(String[] args) {
        int l, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Give value of length :");
        l = sc.nextInt();
        System.out.print("Give value of breath :");
        b = sc.nextInt();

        Rectangle3 r1 = new Rectangle3();
        r1.getxyvalue(l, b);
        r1.showxyvalue();

    }
}

