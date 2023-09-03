package gfgLeetcodeProblems.leetcode;

import java.util.ArrayList;

// Can optimise it
public class Optimal_Partition_of_String {
    public static void main(String[] args) {
        System.out.println(partitionString("abacaba"));
    }

    public static int partitionString(String s) {

        char[] arr = s.toCharArray();
        ArrayList<String> subList = new ArrayList<>();
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!list.contains(arr[i])) {
                list.add(arr[i]);
            } else {
                String sub = "";
                for (Character ch : list) {
                    sub = "" + ch;
                }
                subList.add(sub);
                list.clear();

                list.add(arr[i]);
            }

            if (i == arr.length - 1) {
                subList.add("" + arr[i]);
            }
        }

        return subList.size();
    }

}
