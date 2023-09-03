package com.company.basicCode;

import java.util.Arrays;

public class p10RemoveDuplicateFromArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 2, 8, 4, 4, 7, 9, 2};
        int[] uniArr = new int[10];;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    arr[j] = 0;
                }
            }
            if(arr[i] != 0){
                uniArr[count] = arr[i];
                count++;
            }
        }
        System.out.println("Array after removing duplicate elements : " + Arrays.toString(uniArr));
    }
}
