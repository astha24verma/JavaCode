//15.0  Write a method that takes an integer value and returns the number with its digits reversed.
//        For example, given the number 7631, the method should return 1367. Incorporate the method
//        into an application that reads a value from the user and displays the result.
package com.mypack.assignment;

import java.util.Scanner;

class CalReverse{
    public int revDigit(int num){
        int  rem, sum = 0;
        while (num != 0){
            rem = num % 10;
            num = num / 10;
            sum = sum*10 + rem;
        }
        return sum;
    }
}
public class ReversedDigits {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        CalReverse d1 = new CalReverse();
        System.out.print("Enter Numbers to reverse it : ");
        n = sc.nextInt();
        System.out.println("Reversed Number is : "+d1.revDigit(n));
    }
}
