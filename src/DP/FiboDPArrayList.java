package DP;

import java.util.ArrayList;

public class FiboDPArrayList {
    public static void main(String[] args) {
        // Nth term in fibonacci
        // 0 1 1 2 3 5 8 13 21 34 55...
        // 0 1 2 3 4 5 6 7  8  9  10th... ( 0th indexing based let's assume )
        int n = 40;

        ArrayList<Integer> dpList = new ArrayList<>(n);
        for (int i = 0; i < n + 1; i++) {
            dpList.add(-1);
        }
        System.out.println(dpList);
        System.out.println(fibo(n, dpList));
    }

    private static int fibo(int n, ArrayList<Integer> dpList) {

        if (n <= 1) {
            return n;
        }

        if (dpList.get(n) != -1) {
            return dpList.get(n);
        }

        int val = fibo(n - 1, dpList) + fibo(n - 2, dpList);
        dpList.set(n, val);
        return dpList.get(n);

    }
}

