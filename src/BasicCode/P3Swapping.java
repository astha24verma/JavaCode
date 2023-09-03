package com.company.basicCode;

import java.util.Scanner;

public class P3Swapping {
    public static void main(String[] args) {
        System.out.print("Enter two numbers to swap:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swap -> " + a + " " +b);
    }
}
