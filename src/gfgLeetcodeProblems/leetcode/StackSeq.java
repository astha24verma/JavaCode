package gfgLeetcodeProblems.leetcode;

import java.util.Stack;

public class StackSeq {
    public static void main(String[] args) {
        int[] pushed = {2, 1, 0};
        int[] popped = {1, 2, 0};
        System.out.println(validateStackSequences(pushed, popped));
    }

    public static boolean validateStackSequences(int[] pushed, int[] popped) {

        Stack<Integer> st = new Stack<>();

        int m = 0;
        int n = 0;
        while (n < popped.length && m < pushed.length) {

            System.out.println("n -- " + n + " popped[n] " + popped[n]);
            System.out.println("m -- " + m + " pushed[m] " + pushed[m]);


            if (popped[n] != pushed[m]) {
                st.push(pushed[m]);
                m++;
            } else {
                st.push(pushed[m]);
                System.out.println("Peeking ..." + st.peek() + " and " + popped[n]);
                if (st.peek() == popped[n]) {
                    st.pop();
                    System.out.println("poping");
                    n++;
                    m++;
                }
            }
            System.out.println(st);
        }

        System.out.println("n -- " + n + " popped[n] " + popped[n] + " & peek " + st.peek());
        while (!st.isEmpty()) {
            if (st.peek() == popped[n]) {
                st.pop();
                n++;
                System.out.println("poping remaining");
            } else {
                return false;
            }

        }

        System.out.println("End stack -- " + st);

        if (st.isEmpty()) {
            return true;
        }

        return false;
    }
}
