//6.0  Write the Java application that inputs a series of 10 integers and prints the largest integer.
//        Your program should use at least the following three variables:
//        a) counter: A counter to count to 10 (i.e., to keep track of how many numbers have been input
//        and to determine when all 10 numbers have been processed).
//        b) number: The integer most recently input by the user.
//        c) largest: The largest number found so far.

package com.mypack.assignment;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        int counter = 1;
        int number;
        int largest = 0;
        System.out.println("Enter 10 numbers : ");
        while(counter <= 10){
            System.out.print("Enter Number "+ counter +" : ");
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            if (number > largest){
                largest = number;
            }
            counter++;
        }
        System.out.println("Largest Number is : "+ largest);
    }
}
