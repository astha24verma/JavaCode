package com.company.algorithms.bitManipulationMathQuestions;

// Find which number is not appearing twice in array
public class IsOneWhenOtherAreTwo {

    // a ^ a = 0 (i.e. a XOR a = 0)
    // Note ==> a ^ b ^ c = b ^ a ^ c      -> order does not matters

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 1, 2 , 1, 3, 6, 4};
        System.out.println(notTwice(arr));
    }

    private static int notTwice(int[] arr) {
        int res = 0;

        for(int n : arr){
            res ^= n;
        }

        return res;
    }
}
