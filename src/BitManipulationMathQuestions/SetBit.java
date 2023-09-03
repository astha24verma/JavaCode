package com.company.algorithms.bitManipulationMathQuestions;

public class SetBit {
    // Set the i-th bit (from right)  :   if 0 --> 1     if 1 --> 1
    // n = 10 -> bin = (1 0 1 0)
    //                  4 3 2 1     <-  i-th position
    public static void main(String[] args) {
        int n = 10;
        int i = 3;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(setBit(n, i));
    }

    private static int setBit(int n, int i) {
        int mask = 1 << (i - 1);
        int res = Integer.parseInt(Integer.toBinaryString(n | mask));
        return res;
    }
}
