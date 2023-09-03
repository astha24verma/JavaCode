package com.company.algorithms.recursion;

public class OneToN {
    public static void main(String[] args) {
        int n = 5;
//        ascN(n);
//        dscN(n);
        both(n);
    }

    // n to 1 - Printing while calls are added to stack
    static void ascN(int n) {
        if (n < 1) {
            return;
        }
//        System.out.println(n);
        ascN(n - 1);
    }

    // 1 to n - Printing while calls are exiting from stack
    static void dscN(int n) {
        if (n < 1) {
            return;
        }
        dscN(n - 1);
        System.out.println(n);
    }

    // combined
    static void both(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        both(n - 1);
        System.out.println(n);

    }


}
