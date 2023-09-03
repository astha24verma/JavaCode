package com.company.algorithms.recursion;


// Works similar to Bubble Sort :::::::
public class Patterns {
    public static void main(String[] args) {
        printDown(4, 0);
        printUp(4, 0);    // Just Print '*' after calls are getting removed from stack ;)
        System.out.println();
        printManualUp(1, 0);
    }

    private static void printDown(int r, int c) {
        //base
        if (r == 0) {
            return;
        }
        if (r > c) {
            System.out.print("* ");
            printDown(r, c + 1);
        } else {
            System.out.println();
            printDown(r - 1, 0);
        }
    }

    //    Reverse printing in recursion
    private static void printUp(int r, int c) {
        //base
        if (r == 0) {
            return;
        }
        if (r > c) {
            printUp(r, c + 1);
            System.out.print("* ");
        } else {
            printUp(r - 1, 0);
            System.out.println();
        }
    }

    private static void printManualUp(int r, int c) {

        if (r == 5) {
            return;
        }
        if (r > c) {
            System.out.print("* ");
            printManualUp(r, c + 1);
        } else {
            System.out.println();
            printManualUp(r + 1, 0);
        }
    }
}
