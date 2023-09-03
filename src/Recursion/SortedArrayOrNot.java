package Recursion;

public class SortedArrayOrNot {
    public static void main(String[] args) {
        int[] arr = {2, 5, 0, 12, 15, 19, 24};
        System.out.println(isSorted(arr, 0));
    }

    private static boolean isSorted(int[] arr, int index) {

        if (index == arr.length - 1) {
            return true;
        }

        return arr[index] < arr[index + 1] && isSorted(arr, index + 1);
    }
}
