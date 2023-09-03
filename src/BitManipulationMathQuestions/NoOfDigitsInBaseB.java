package com.company.algorithms.bitManipulationMathQuestions;

public class NoOfDigitsInBaseB {
    //Direct Formula :
    // No. of digits in Base - b of Number - n = log n base b + 1   --> integer part
    public static void main(String[] args) {
        int n = 10;
        int b = 2;
        System.out.println((int) (Math.log(n) / Math.log(b)) + 1);
    }
}
