package Recursion;

import java.util.ArrayList;

public class Subsequence {
    public static void main(String[] args) {
        subseque("", "abc");

        System.out.println(subseqList("", "abc"));
        
        ArrayList<String> arrList = new ArrayList<>();
        System.out.println(subseqListArgs("", "abc", arrList));
    }

    private static void subseque(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subseque(p + ch, up.substring(1));
        subseque(p, up.substring(1));

    }

    // Method 1 -Returning ArrayList of subsequences which is passes in the argument
    private static ArrayList<String> subseqListArgs(String p, String up, ArrayList<String> list) {
        if (up.isEmpty()) {
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        subseqListArgs(p + ch, up.substring(1), list);
        subseqListArgs(p, up.substring(1), list);

        return list;
    }


    // Method 2 - Returning ArrayList of subsequences
    private static ArrayList<String> subseqList(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subseqList(p + ch, up.substring(1));
        ArrayList<String> right = subseqList(p, up.substring(1));

        left.addAll(right);
        return left;
    }

}
