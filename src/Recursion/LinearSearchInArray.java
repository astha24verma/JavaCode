package Recursion;

import java.util.ArrayList;

public class LinearSearchInArray {
    public static void main(String[] args) {
        int[] arr = {2, 5, 0, 24, 12, 24, 15, 19, 24};

        System.out.println(isFound(arr, 25, 0));

        System.out.println(findIndex(arr, 24, 0));

        findAllIndex(arr, 24, 0);
        System.out.println(list);

        System.out.println(findListAllIndex(arr, 24, 0, new ArrayList<>()));

        System.out.println(findListAllIndexAddingIntoListAfterEachCall(arr, 24, 0));

    }

    // Return list without passing the argument - NOT RECOMMENDED BUT IS NEEDED SOMETIMES
    private static ArrayList<Integer> findListAllIndexAddingIntoListAfterEachCall(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> ansFromBelowCalls = findListAllIndexAddingIntoListAfterEachCall(arr, target, index+1);
        list.addAll(ansFromBelowCalls);
        return list;
    }

    // List in argument - RECOMMENDED
    private static ArrayList<Integer> findListAllIndex(int[] arr, int target, int index, ArrayList<Integer> list) {
        if(index == arr.length){
            return list;
        }

        if(arr[index] == target){
            list.add(index);
        }

        return findListAllIndex(arr, target, index+1, list);
    }


    // Storing answer in outside - static - list
    static ArrayList<Integer> list = new ArrayList<>();
    private static void findAllIndex(int[] arr, int target, int index) {
        if(index == arr.length){
            return;
        }

        if(arr[index] == target){
            list.add(index);
        }

        findAllIndex(arr, target, index+1);

    }

    private static int findIndex(int[] arr, int target, int index) {  // Similarly findLastIndex() can be created
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }else{
           return findIndex(arr, target, index+1);
        }
    }

    public static boolean isFound(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }

        return arr[index] == target || isFound(arr, target, index+1);
    }
}
