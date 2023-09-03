package com.company.basicCode;

import java.util.Scanner;

public class P4SumOfDigits {
    public static void main(String[] args) {
        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n , rem = 0, sum = 0;
        n = num;
        while(n != 0){
            rem = n % 10;
            sum = sum + rem;
            n = n / 10;
        }
        System.out.println("Sum of digits of "+ num +" is : "+sum);

    }
}
