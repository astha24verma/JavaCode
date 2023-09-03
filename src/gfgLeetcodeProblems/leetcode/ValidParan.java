package gfgLeetcodeProblems.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class ValidParan {
    public static void main(String[] args) {
        System.out.println(isValid("(()[]"));

    }

    public static boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');

        Stack<Character> stk = new Stack<>();

        char[] chArr = s.toCharArray();
        System.out.println(Arrays.toString(chArr));

        if (chArr.length == 1) {
            return false;
        }

        for (char ch : chArr) {
            System.out.println("current ch -- " + ch);

            if (map.containsKey(ch)) {
                stk.push(ch);
            } else {
                if (!stk.isEmpty()) {
                    System.out.println("peeking  -- " + stk.peek());
                    System.out.println("value -- " + ch);
                    if (map.get(stk.peek()).equals(ch)) {
                        stk.pop();
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }

            }

            System.out.println("Stack now --> " + stk);
        }

        System.out.println("End -- " + stk);
        return stk.isEmpty();
    }
}
