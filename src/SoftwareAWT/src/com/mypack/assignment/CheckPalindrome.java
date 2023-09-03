//9.0  A palindrome is a sequence of characters that reads the same backward as forward. For
//       example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554 and
//       11611. Write an application that reads in a five-digit integer and determines whether it’s a
//       palindrome. If the number is not five digits long, display an error message and allow the user to
//       enter a new value.
package com.mypack.assignment;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        int n, num, rem, sum =0;
        System.out.println("Enter 5 digit Number to check it is a palindrome or not :");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        num = n;
        while (n>0){
            rem = n%10;
            n = n/10;
            sum = sum*10 + rem;
        }
        if (sum == num) {
            System.out.println("Number is Palindrome.");
        }
        else
            System.out.println("Number is not Palindrome.");
    }
}
