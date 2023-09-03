package Recursion;

// Special example - when recursive calls return final value
public class CountZeros {
    public static void main(String[] args) {
        int n = 302040057;
        System.out.println(count(n));
    }

    private static int count(int n) {
        return helper(n, 0);
    }

    private static int helper(int n, int count) {
        if (n == 0) {
            return count;      // Final value of count will be returned from this line to above all the function calls
        }
        if (n % 10 == 0) {
            return helper(n / 10, count + 1);
        }
        return helper(n / 10, count);
    }
}
