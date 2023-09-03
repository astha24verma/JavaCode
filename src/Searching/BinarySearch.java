package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] nums = {-3, 0, 1, 4, 7, 8, 19, 30, 55};
        int target = 30;
        int ans = binarySearch(nums, target);
        System.out.println(ans);
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
