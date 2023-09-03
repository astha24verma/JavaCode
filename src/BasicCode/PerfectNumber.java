package BasicCode;

import java.util.Scanner;

public class PerfectNumber {         //a positive integer that is equal to the sum of its proper divisors except itself.
                                     //eg. 6, 28, 496, 8128 ...        ( 1 + 2 + 3 = 6 = Perfect Number )

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to Check whether it is a Perfect Number or Not : ");
        int num = sc.nextInt();
        int i, sum = 0;

        for(i = 1; i < num; i++)
        {
            if(num % i == 0)
            {
                sum = sum + i;
            }
        }
        if(sum == num)
        {
            System.out.println("Yes, "+num+" is a Perfect Number.");
        }
        else
        {
            System.out.println("No!, "+num+" is not a Perfect Number .");
        }
    }
}
