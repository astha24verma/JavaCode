package Recursion;

public class SumAndProdNToOne {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sum(n));
        System.out.println(fact(n));
    }

    private static int sum(int n) {
        if (n == 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    //    n !
    private static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

}
