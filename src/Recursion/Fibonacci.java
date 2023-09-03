package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        // Nth term in fibonacci
        // 0 1 1 2 3 5 8 13...
        // 0 1 2 3 4 5 6 7 8 9 10th... ( 0th indexing based let's assume )
        int n = 5;
        System.out.println(fibo(5));
    }

    private static int fibo(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        return fibo(n - 1) + fibo(n - 2);
    }
}
