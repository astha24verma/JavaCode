package com.company.algorithms.recursion;

public class SumAndProdOfDigits {
    public static void main(String[] args) {
        int n = 1342;
        System.out.println(sumOfDigits(n));
        System.out.println(prodOfDigits(n));
    }

    private static int sumOfDigits(int n) {
        if (n == 0) {
            return 0;
        }

        return (n % 10) + sumOfDigits(n / 10);
    }

    //    n !
    private static int prodOfDigits(int n) {
        if (n % 10 == n) {
            return n;
        }
        return (n % 10) * prodOfDigits(n / 10);
    }
}