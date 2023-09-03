package gfgLeetcodeProblems.leetcode;

import java.util.Arrays;
import java.util.Stack;

public class path {
    public static void main(String[] args) {
        System.out.println(simplifyPath("/../"));
    }

    public static String simplifyPath(String path) {
        String canoPath = "";
        Stack<String> st = new Stack<>();
        String arr[] = path.split("/");
        System.out.println(Arrays.toString(arr));

        for (String str : arr) {
            st.push("/");
            if (!str.isEmpty()) {
                if (str.equals(".")) {
                    continue;
                } else if (str.equals("..") && !st.isEmpty()) {
                    st.pop();
                } else {
                    st.push(str);
                }
            }
        }

        System.out.println(st);

        while (!st.isEmpty()) {
            canoPath = st.pop() + canoPath;
            System.out.println(canoPath);
        }

        return canoPath;
    }
}
