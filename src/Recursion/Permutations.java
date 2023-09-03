package Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Permutations {

    public static List<String> list = new ArrayList<>();

    public static List<String> findPermutations(String s) {
        permute(s, 0, s.length() - 1, list);
        return list;
    }

    public static List<String> permute(String s, int l, int r, List<String> list) {
        if (l == r) {
            list.add(s);
            return list;
        }
        for (int i = l; i <= r; i++) {
            s = swap(s, l, i);
            permute(s, l + 1, r, list);
            s = swap(s, l, i);
        }
        return list;
    }

    public static String swap(String str, int i, int j) {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
//        System.out.println(Arrays.toString(charArray) + " " + String.valueOf(charArray));
        return String.valueOf(charArray);

    }


    public static void main(String[] args) {
        // characters = 3               =>      permutations = 3! = 6
//        permutations("", "abc");

        System.out.println(findPermutations("abc"));

    }

//    private static void permutations(String p, String up) {
//        if (up.isEmpty()) {
//            System.out.println(p);
//            return;
//        }
//
//        char ch = up.charAt(0);
//        for (int i = 0; i <= p.length(); i++) {
//            String first = p.substring(0, i);
////            System.out.println("f - " + first);
////            System.out.println("ch - " + ch);
//            String second = p.substring(i, p.length());
////            System.out.println("s - " + second);
//            permutations(first + ch + second, up.substring(1));
//        }
//    }
}
