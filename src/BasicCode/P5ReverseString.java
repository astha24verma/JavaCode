package com.company.basicCode;

import java.util.Scanner;

public class P5ReverseString {
    public static void main(String[] args) {
        System.out.print("Enter a String to reverse : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        char[] arr = str.toCharArray();
        for (int i = arr.length - 1; i >= 0 ; i--){
            System.out.print(""+ arr[i]);
        }

//        for (int i = str.length() - 1; i >=0 ; i--) {
//            System.out.print(str.charAt(i));
//        }
    }
}
