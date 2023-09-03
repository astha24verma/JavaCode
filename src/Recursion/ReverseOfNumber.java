package Recursion;

public class ReverseOfNumber {
    public static void main(String[] args) {
        int n = 1824;   //4281 -->  f(182) & sum = ( 4 ) --> f(18) & sum = ( 4*10 + 2 ) ....

        reverse1(n);
        System.out.println(sum);

        System.out.println(reverse2(n));

        // Palindrome Number - using reverse method
        System.out.println(palin(1256521));
    }

    private static boolean palin(int n) {
        return n == reverse2(n);
    }

    // Method 1
    //n = 1824 : 4281 -->  f(182) & sum = ( 4 ) --> f(18) & sum = ( 4*10 + 2 ) ....
    static int sum = 0;

    private static void reverse1(int n) {
        if (n == 0) {
            return;
        }
        int rem = n % 10;
        sum = sum * 10 + rem;
        reverse1(n / 10);
    }


    // Method 2
    //n = 1824 : 4281 -->  ( 4 * 10^3 ) + f(182) --> ( 4 * 10^3 ) + ( 2 * 10^2 ) + f(18)  ....
    private static int reverse2(int n) {
        int digits = (int) Math.log10(n) + 1;
        return helper(n, digits);
    }

    // helper method - introduce when you want to extra args -> here extra argument is ' digits '
    private static int helper(int n, int digits) {

        if (n % 10 == 0) {
            return n;
        }

        return (n % 10) * (int) Math.pow(10, digits - 1) + helper(n / 10, digits - 1);

    }
}
