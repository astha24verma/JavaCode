package com.company.basicCode;

import java.util.Arrays;

//Bubble Sort
public class P13BubbleSort {
    public static void main(String[] args) {
        int[] arr = {2, 8, 5, 9, 12, 0, 4, 6, 3};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i <= arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[i]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println("Array after Bubble Sort : \n" + Arrays.toString(arr));
    }
}
