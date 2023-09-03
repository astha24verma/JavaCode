package com.company.basicCode;

import java.util.Arrays;

//Write a program to find top two maximum numbers in an array.
public class P14TwoMaxNumbers {
    public static void main(String[] args) {
        int[] arr = {2, 8, 5, 9, 12, 0, 12, 6, 7};
        System.out.println(Arrays.toString(arr));
        int max = arr[0];
        int max2 = arr[0];
        for (int i = 0; i <= arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > max) {
                    max2 = max;
                    max = arr[j];
                }
            }
        }
        System.out.println("Maximum number =  "+max + " \nSecond maximum number = "+ max2 );
    }
}
