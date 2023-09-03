package Sorting;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {

        //int[] nums = {-4, 6, 19, 2, -18, 5, 21, 0, 7, 12};
        int[] nums = {3, 5, 2, 1, 4};
        // int[] nums = {5, 3, 4, 1, 2};
//         bubble(nums);
//         selection(nums);
//         insertion(nums);
        cyclic(nums);
        System.out.println(Arrays.toString(nums));
    }

    //Bubble sort
    static void bubble(int[] arr) {
        boolean swapped;
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }

    //Selection sort
    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int max = getMaxIndex(arr, 0, last);
            swap(arr, max, last);
        }
    }

    static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {             // i <= arr.length - 2
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }

    static void cyclic(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == (i + 1)) {
                //Rightly placed
                break;
            } else {
                int temp = arr[arr[i] - 1];  //2
                arr[arr[i] - 1] = arr[i];     // 2 --> 3
                arr[arr[i] - 2] = temp;  //

            }
        }
    }

}
