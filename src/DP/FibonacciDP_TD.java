package DP;

import java.util.Arrays;

// Top-Down Approach
public class FibonacciDP_TD {
    public static void main(String[] args) {
        // Nth term in fibonacci
        // 0 1 1 2 3 5 8 13 21 34 55...
        // 0 1 2 3 4 5 6 7  8  9  10th... ( 0th indexing based let's assume )
        int n = 40;

        //Step 1
        int[] dpArr = new int[n + 1];
        Arrays.fill(dpArr, -1);

         /*
         OR ->
         for (int i = 0; i < n; i++) {
             dpArr[i] = -1;
         }
        */
        System.out.println(fibo(n, dpArr));
    }

    private static int fibo(int n, int[] dpArr) {

        if (n <= 1) {
            return n;
        }

        //Step 3
        if (dpArr[n] != -1) {
            return dpArr[n];
        }

        //Step 2
        dpArr[n] = fibo(n - 1, dpArr) + fibo(n - 2, dpArr);
        return dpArr[n];

    }
}
