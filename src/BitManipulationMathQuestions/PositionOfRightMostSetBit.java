package com.company.algorithms.bitManipulationMathQuestions;

public class PositionOfRightMostSetBit {
    // Find the position of Right-most Set-Bit(1)  :
    // n = 10 -> bin = (1 0 1 0)
    //                  4 3 2 1     <- Position of right-most Set-Bit(1) = 2
    public static void main(String[] args) {
        int n = 10;
        System.out.println(Integer.toBinaryString(n));
        System.out.println(rightmostSetBit(n));
    }

    private static int rightmostSetBit(int n) {
        //  Time Complexity - O(no. of digits in binary)
        int pos = 1;
        while ((n & 1) == 0) {   // 1 & 1 == 1 then exist
            n = n >> 1;
            pos++;
        }
        return pos;

//        System.out.println(Integer.toBinaryString(n & -n) + "-" + Integer.toBinaryString(n) + "-" + Integer.toBinaryString(-n));
//        int count = 1;
//        int rem = (n & -n); //   (1 0 1 0) & (0 1 1 0) = (1 0)
//        // now counting and removing 0 s left side of right-most set-bit
//        while ((rem & 1) == 0) {
//            count++;
//            rem = rem >> 1;
//        }
//        return count;
    }
}
