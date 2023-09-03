package com.company.algorithms.bitManipulationMathQuestions;

public class RangeXOR {
    public static void main(String[] args) {
        // XOR from 0 to a
        int a = 3;
        System.out.println(xor(a));

        // Range of XOR from a to b === xor(b) ^ xor(a-1)
        int b = 9;
        System.out.println(xor(b) ^ xor(a - 1));

        // Only for check; Will give TLE for large number
//        int res = 0;
//        for (int i = a; i <= b; i++) {
//            res ^= i;
//        }
//        System.out.println(res);
    }

    private static int xor(int a) {
        if (a % 4 == 0)
            return a;

        if (a % 4 == 1)
            return 1;

        if (a % 4 == 2)
            return a + 1;

        return 0;
    }
}
