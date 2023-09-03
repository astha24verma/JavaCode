//14.0  Write a method minimum3 that returns the smallest of three floating point numbers.
//        Incorporate the method into an application that reads three values from the user, determines the
//        smallest value and displays the result.
package com.mypack.assignment;

import java.util.Scanner;

class CalSmallest{
    public float minimum3 (float n1, float n2, float n3){
        if (n1 < n2 && n1 < n3)
            return n1;
        else if (n2 < n1 && n2 < n3)
            return n2;
        else
            return n3;
    }
}
public class Smallest {
    public static void main(String[] args) {
        float n1, n2, n3;
        Scanner sc = new Scanner(System.in);
        CalSmallest sm1 = new CalSmallest();
        System.out.println("Enter 3 Floating Point Numbers : ");
        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        System.out.println("Smallest of three floating point numbers : "+sm1.minimum3(n1,n2,n3));
    }
}
