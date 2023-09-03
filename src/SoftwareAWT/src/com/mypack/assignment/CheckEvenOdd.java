//19.0  Write a method is Even that uses the remainder operator (%) to determine whether an
//        integer is even. The method should take an integer argument and return true if the integer is even
//        and false otherwise. Incorporate this method into an application that inputs a sequence of
//        integers (one at a time) and determines whether each is even or odd.
package com.mypack.assignment;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class EvenOdd{
    public String  even(int num){
        if (num % 2 == 0){
            return "true";
        }
        else {
            return "false";
        }
    }
}
public class CheckEvenOdd {
    public static void main(String[] args) {
        int n;
        String res;
        Scanner sc = new Scanner(System.in);
        EvenOdd n1 = new EvenOdd();
        System.out.print("Enter Number to check it is Even or Odd; or -1 anytime to Stop Checking : ");
        do{
            n = sc.nextInt();
            if (n > 0){
                res = n1.even(n);
                if (res.equals("true")){
                    System.out.println("Number is Even.");
                }
                else {
                    System.out.println("Number is Odd.");
                }
            }
            else
                break;
        }while (n >= 0);
    }
}
