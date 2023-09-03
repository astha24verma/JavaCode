package com.company.basicCode;

import java.util.HashSet;
import java.util.Set;

public class TestCode02 {
    public static void main(String[] args) {
//        String text1 = "abc";
//        String text2 = "abc";
//        System.out.println(longestCommonSubsequence(text1, text2));
        
        // Happy Number by Google
        int n = 125566;
        Set<Integer> set = new HashSet<>();
        while (n > 0) {
            n = squareSum(n);
            System.out.println("n = " + n);
            if (set.contains(n)) {
                break;
            }
            set.add(n);
            if (n == 1) {
                System.out.println("true");
                break;
            }

        }

        System.out.println(set);
        System.out.println("false");
    }

    private static int squareSum(int num) {
        int n = num;
        int rem = 0;
        int sum = 0;
        while (n > 0) {
            rem = n % 10;
            sum = sum + rem * rem;
            n = n / 10;
        }
        return sum;
    }

    static public int longestCommonSubsequence(String text1, String text2) {
        int len = 0;
        if (text1.length() >= text2.length()) {
            len = subseq(text1, text2);
        } else {
            len = subseq(text2, text1);
        }
        return len;
    }

    public static int count = 0;

    public static int subseq(String max, String min) {
        if ((min.length() == 0) || (max.length() == 0)) {
            return count;
        }

        if (max.charAt(0) == min.charAt(0)) {
            count++;
            System.out.println(count);
            return subseq(max.substring(1), min.substring(1));
        } else {
            return subseq(max.substring(1), min);
        }

    }
}