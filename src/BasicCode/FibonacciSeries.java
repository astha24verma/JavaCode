package BasicCode;

import java.util.Scanner;

public class FibonacciSeries {
    //(-1 , 1) 0 1 1 2 3 5 8 13 ....
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of Terms to Get Fibonacci Series : ");
        int num = sc.nextInt();
        int a = -1, b = 1, c, i;
        for (i = 0; i < num; i++) {
            c = a + b;
            System.out.print(c + "    ");
            a = b;
            b = c;
        }

    }
}
