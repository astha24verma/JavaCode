package Recursion;

public class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(search(arr, 0, arr.length, 6));
    }

    static int search(int arr[], int s, int e, int key)
    {
        // l: The starting index
        // h: The ending index, you have to search the key in this range
        // Complete this function

        if(s > e){
            return -1;
        }

        int m = s + (e - s)/2;

        if(arr[m] == key){
            return m;
        }

        if(arr[s] <= arr[m]){   // Check for 1st half
            if(key >= arr[s] && key <= arr[m]){
                return search(arr, s, m - 1, key);
            }else{
                return search(arr, m + 1, e, key);
            }
        }

        if(key >= arr[m] && key <= arr[e]){
            return search(arr, m + 1, e, key);
        }

        return search(arr, s, m - 1, key);

    }
}


