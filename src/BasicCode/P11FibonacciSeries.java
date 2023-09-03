package com.company.basicCode;

import java.util.Scanner;

//                                                        a  b
//Write a program to print Fibonacci series.        0, 1, 1, 2, 3, 5, 8, 13, 21, 34,.......
public class P11FibonacciSeries {
    public static void main(String[] args) {

        System.out.print("Enter number of elements to print Fibonacci series : ");
        Scanner sc = new Scanner(System.in);
        int ele = sc.nextInt();

        int a = 0;
        int b = 1;
        int sum;
        System.out.print(a + ", " +b + ", ");
        for (int i = 2; i <= ele; i++) {
            sum = a+b;
            if(i == ele){
                System.out.print(sum);
            }else{
                System.out.print(sum + ", ");
            }
            a = b;
            b = sum;
        }
    }
}
