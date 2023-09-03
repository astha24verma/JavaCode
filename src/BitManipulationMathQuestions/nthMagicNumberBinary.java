package com.company.algorithms.bitManipulationMathQuestions;

public class nthMagicNumberBinary {

    // Magic number --> n = 1 => (0 0 1) in base 2 => 0 * 5^3 +  0 * 5^2 +  1 * 5^1 = 5
    //                  n = 2 => (0 1 0) in base 2 => 0 * 5^3 +  1 * 5^2 +  0 * 5^1 = 25  ..so on

    public static void main(String[] args) {
        int n = 2;
        System.out.println(MagicNumber(n));
        System.out.println(MagicNumberBinary(n));
    }

    // By converting into binary
    private static int MagicNumber(int n) {
        String s = Integer.toBinaryString(n);
        int bin = Integer.parseInt(s);
        int num = bin, rem = 0, sum = 0;
        int count = 1;
        while (num != 0) {
            rem = num % 10;
            sum = (int) (sum + rem * Math.pow(5, count));
            count++;
            num = num / 10;
        }
        return sum;
    }

    // Without converting into binary (internally it does)

    // n = 4 ; bin = 1 0 0 ; last = (1 0 0) & (1) ; To reduce number to (1 0) from (1 0 0) right shift by 1
    private static int MagicNumberBinary(int n) {
        int res = 0;
        int base = 5;

        while (n != 0) {
            int last = n & 1;
            res += last * base;
            base *= 5;
            n = n >> 1;
        }
        return res;
    }
}
