package gfgLeetcodeProblems;

import java.util.Arrays;

public class MissingN {
    public static int findKthPositive(int[] arr, int k) {
        int[] res = new int[k + 1]; //arr[arr.length-1]
        int count = 0;

        if (arr[0] != 1) {
            for (int m = 0; m < arr[0] - 1; m++) {
                res[count] = m + 1;
                count++;
            }
        }

        for (int i = 0; i < arr.length - 1; i++) {
            System.out.println(arr[i]);
            System.out.println("i : " + i);

            if (arr[i] != i + 1) {

                if (arr[i + 1] - arr[i] > 1) {
                    for (int j = arr[i] + 1; j < arr[i + 1]; j++) {
                        res[count] = j;
                        count++;
                    }
                }
                
            }
            System.out.println("res : " + Arrays.toString(res));
        }

        int move = arr[arr.length - 1];
        for(int p = 0; p < 5; p++){
            res[count] = move;
            count++;
            move++;
        }


        System.out.println("======" + res[k - 1]);
        return res[k - 1];
    }

    public static void main(String[] args) {

        System.out.println("Ans - " + findKthPositive(new int[]{1, 2, 3, 4}, 2));
    }
}
