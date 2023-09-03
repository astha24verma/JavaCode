package com.company.basicCode;

import java.util.Arrays;

//Write a program Find out duplicate number between 1 to N numbers.
public class P12DuplicateNumbers {
    public static void main(String[] args) {
        int[] arr = {2, 6, 7, 2, 9, 3, 6, 9, 2, 12};
        Arrays.sort(arr);

        System.out.print("List of duplicate numbers : ");
        for (int i = 0; i < arr.length-1; i++) {
            if (arr[i] == arr[i+1]){
                System.out.print(arr[i] +", ");
            }
        }
    }
}
