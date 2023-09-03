package DP;

import java.util.Arrays;

// Bottom-Up Approach
public class FibonacciDP_BU {

    public static void main(String[] args) {
        // Nth term in fibonacci
        // 0 1 1 2 3 5 8 13 21 34 55...
        // 0 1 2 3 4 5 6 7  8  9  10th... ( 0th indexing based let's assume )
        int n = 10;

        //Step 1
        int[] dpArr = new int[n + 1];

        //Step 2
        dpArr[0] = 0;
        dpArr[1] = 1;

        //Step 3
        for (int i = 2; i <= n; i++) {
            dpArr[i] = dpArr[i - 1] + dpArr[i - 2];
        }

        System.out.println(dpArr[n]);
    }
}
