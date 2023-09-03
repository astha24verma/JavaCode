package com.company.basicCode;

import java.util.Scanner;

public class P2CheckPrime {
    public static void main(String[] args) {
        System.out.print("Enter a number to check prime or not : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(checkPrime(n)){
            System.out.println(n +" is a Prime Number.");
        }else{
            System.out.println(n +" is not a Prime Number.");
        }
    }

    public static boolean checkPrime(int num) {
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
