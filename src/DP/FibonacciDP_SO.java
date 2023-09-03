package DP;

// Space Optimization Approach
public class FibonacciDP_SO {
    public static void main(String[] args) {

        // Nth term in fibonacci
        // 0 1 1 2 3 5 8 13 21 34 55...
        // 0 1 2 3 4 5 6 7  8  9  10th... ( 0th indexing based let's assume )
        int n = 8;

        int curr, prev1, prev2;

        prev1 = 1;
        prev2 = 0;

        for (int i = 2; i <= n; i++) {
            curr = prev1 + prev2;
            //Shifting ->
            prev2 = prev1;
            prev1 = curr;
        }

        System.out.println(prev1);

    }
}
