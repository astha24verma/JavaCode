//8.0   Write an application that prompts the user to enter the size of the side of a square, then
//        displays a hollow square of that size made of asterisks(*). Your program should work for squares
//        of all side lengths between 1 and 20.
package com.mypack.assignment;

import java.util.Scanner;

public class SquarePattern {
    public static void main(String[] args) {
        int n, i,j;
        System.out.print("Enter side of square : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        //int[] arr = new int[n];
        for (i =1; i<=n; i++){
            for (j = 1; j<=n; j++){
                if ((i==1 || i==n ) || (j==1 || j==n )){
                    System.out.print("*\t");
                }
                else {
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
}
