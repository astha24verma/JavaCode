package com.company.algorithms.bitManipulationMathQuestions;

public class NoOfSetBits {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(NumberOfSetBits(n));
    }

    private static int NumberOfSetBits(int n) {

        int count = 0;

        //  Time Complexity - O(no. of digits in binary)
//        while (n > 0) {
//            if ((n & 1) == 1) {
//                count++;
//            }
//            n = n >> 1;
//        }

        //  Time Complexity - O(no. of set bits - 1 - in binary)    --> Better
        // while loops exits when all the set bits are converted to 0
        // loops runs ' number of set bits ' present in the number
        while (n > 0) {
//            n = n - (n & -n);
            n = n & (n - 1);   //    Changes the --> LSB set-bit / right-most set-bit / right-most 1 --> to 0
            count++;
        }
        return count;
    }
}
