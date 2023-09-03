//23.0:  A class weight an data member pound, which will have the weight in pounds. Using a
//        conversion function convert the weight in pounds to weight in kilograms which is of double type.
//        Write a program to do this (1 pounds = 1 kg/0.453592).use default constructor to initial
//        assignment of 1000 pounds.
package com.mypack.assignment;

import java.util.Scanner;

public class WeightConversion {
    int pound;

    public WeightConversion(){
        pound = 1000;
    }

    public void conversion(int pound){
        this.pound = pound;                             //or pound = p      let us say
        System.out.println("Weight is : " + (pound * 0.453592) + " in kilograms.");
    }

    public static void main(String[] args) {
        int p;
        System.out.print("Enter weight in pounds : ");
        Scanner sc = new Scanner(System.in);
        p = sc.nextInt();

        WeightConversion w1 = new WeightConversion();

        w1.conversion(p);
    }
}
