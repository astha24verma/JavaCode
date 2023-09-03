/*
11.0   The factorial of a non negative integer n is written as n! (Pronounced &#x2015;n factorial&#x2016;) and is
        defined as follows: n!=n ·(n – 1) · (n – 2) · … · For example, 5! = 5 · 4 · 3 · 2 · 1, which is 120.
        a) Write an application that reads a non-negative integer and computes and prints its factorial.
        b) Write an application that estimates the value of the mathematical constant e by using the
        following formula. Allow the user to enter the number of terms to calculate.

        c) Write an application that computes the value of ex
        by using the following formula. Allow the
        user to enter the number of terms to calculate.
*/
package com.mypack.assignment;

import java.util.Scanner;

class Calc {

    // (a)
    public double factorial(int num) {
        double fact = 1.0, i;
        if (num == 0 || num == 1) {
            return fact;
        }
        else {
            for (i = 1; i <= num; i++) {
                fact = fact * i;
            }
            return fact;
        }
    }

    // (b)
    public double calcE(int term){
        //term --> till (term-1)!
        int i;
        double eValue = 0.0;
            for (i = 0; i < term; i++) {
                eValue = eValue + (1/(double)factorial(i));
            }
            return eValue;
    }

    // (c)
    public double calcEToX(int term, int x){
        //term --> till (term-1)!
        int i;
        double eToxValue = 0.0;
        for (i = 0; i < term; i++) {
            eToxValue = eToxValue + (Math.pow(x,i)*(1/(double)factorial(i)));
        }
        return eToxValue;
    }
}

public class FactorialCalculator {
    public static void main(String[] args) {
        int n, t, t2, x;
        Calc c1 = new Calc();
        // (a)
        System.out.print("Enter Number to calculate factorial : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Factorial is : "+c1.factorial(n));
        // (b)
        System.out.print("Enter Number of terms to calculate value of e : ");
        t = sc.nextInt();
        System.out.println("Value of e : "+c1.calcE(t));
        // (c)
        System.out.println("Enter Number of terms and x( = power ) to calculate value of e^x : ");
        t2 = sc.nextInt();
        x = sc.nextInt();
        System.out.println("Value of e : "+c1.calcEToX(t2, x));

    }
}

