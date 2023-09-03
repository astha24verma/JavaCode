package Sorting;

import java.util.Arrays;

public class HeapSort {

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1; // For 1 based indexing, it's 2 * i
        int right = 2 * i + 2;

        if (left < n && arr[largest] < arr[left]) {
            largest = left;
        }

        if (right < n && arr[largest] < arr[right]) {
            largest = right;
        }

        // If largest is not root
        if (largest != i) {
            swap(arr[largest], arr[i]);
            heapify(arr, n, largest);
        }

    }

    void heapSort(int[] arr, int n) {
        //Step 1 - Build Max Heap for array index from n/2 --> 0 ;; all other are leaf nodes
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        //Step 2- Sort
        for (int i = n - 1; i > 0; i--) {
            // step i
            swap(arr[i], arr[0]); // swap with 0th element
            // step ii
            heapify(arr, i, 0); // always start heapify-ing from 0th element or root
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 7, 9, 3, 2};
        System.out.println(Arrays.toString(arr));
        HeapSort hs = new HeapSort();
        hs.heapSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));

    }
}
