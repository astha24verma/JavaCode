package com.company.algorithms.bitManipulationMathQuestions;

public class ResetBit {
    // Reset the i-th bit (from right)  :   if 0 --> 0     if 1 --> 0
    // n = 10 -> bin = (1 0 1 0)
    //                  4 3 2 1     <-  i-th position
    public static void main(String[] args) {
        int n = 10;
        int i = 2;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(resetBit(n, i));
    }

    private static int resetBit(int n, int i) {
        int mask = ~(1 << (i - 1));
        int res = Integer.parseInt(Integer.toBinaryString(n & mask));
        return res;
    }
}
