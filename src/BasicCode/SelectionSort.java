package BasicCode;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {23, 6, 8, 3, 6, 21, 23, 5, 8, 9, 6};
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
