package com.mypack.assignment;

import java.util.Scanner;

public class SecondLargestNumber {
    public static void main(String[] args) {
        int counter = 1;
        int number;
        int largest = 0;
        int secondLargest = -1;
        System.out.println("Enter 10 numbers : ");
        while(counter <= 10){
            System.out.print("Enter Number "+ counter +" : ");
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();

            if (number > largest){
                largest = number;
            }
            if (number < largest && number > secondLargest){
                secondLargest = number;
            }
            counter++;
        }
        System.out.println("Largest Number is : "+ largest);
        System.out.println("Second Largest Number is : "+ secondLargest);
    }
}
