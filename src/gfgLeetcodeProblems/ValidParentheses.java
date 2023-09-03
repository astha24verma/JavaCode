package gfgLeetcodeProblems;

import java.util.HashMap;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String str = "{[()]}";
        System.out.println("Ans = " + isValid(str));

    }

    static public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        HashMap<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        char[] chArr = s.toCharArray();
        for (char ch : chArr) {
            for (char key : map.keySet()) {

                st.push(ch);

                if (map.get(key) == ch) {
                    if (st.search(key) > -1) {
                        st.pop();
                    }
                }

            }
        }

        return st.isEmpty();
    }
}
