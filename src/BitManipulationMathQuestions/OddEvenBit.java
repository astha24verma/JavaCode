package com.company.algorithms.bitManipulationMathQuestions;

// To get LSB --> n & 1
// LSB is 1 --> Odd
// LSB is 0 --> Even

public class OddEvenBit {
    public static void main(String[] args) {
        int n = 7;
        System.out.println( n + " is odd : " + isOdd(n));
    }

    private static boolean isOdd(int n) {
        return (n & 1) == 1;
    }
}
