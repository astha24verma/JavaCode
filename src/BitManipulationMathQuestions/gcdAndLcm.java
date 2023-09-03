package BitManipulationMathQuestions;

public class gcdAndLcm {
    public static void main(String[] args) {
        int a = 8;
        int b = 12;
        int gcd = 1;
        int min = Math.min(a, b);
        for (int i = 1; i <= min; i++) {
            if ((a % i == 0) && (b % i == 0)) {
                gcd = i;
            }
        }
        System.out.println("GCD = " + gcd);
        System.out.println("LCM = " + (a * b) / gcd);

        //Divisors of num
        int num = 24;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();

        // Table
        int t = 12;
        int n = 1;
        while (n <= 10) {
            System.out.println(t + " x " + n + " = " + t * n);
            n++;
        }

    }
}
