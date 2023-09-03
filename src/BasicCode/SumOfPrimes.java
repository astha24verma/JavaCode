package BasicCode;

import java.util.Scanner;

public class SumOfPrimes {
    public static void main(String[] args) {
        int n, sum = 0;
        int count;
        System.out.print("Enter Number till where you want to calculate sum of Prime numbers : ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            count = 0;
            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                sum += i;
                //System.out.println(i +" ");
            }
        }
        System.out.println("Sum of first "+n+" Prime numbers is :"+sum);

    }
}