package BasicCode;

import java.util.Scanner;

public class TwinPrimeNumbers {                   // Twin Primes are the prime numbers with a difference of 2
                                                 // e.g., (3, 5), (5, 7), (11, 13), (17, 19), (29, 31) ... etc.
    public static void main(String[] args) {
        int i, min, max;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers to Check whether they are Twin Prime Numbers or Not : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        min = Math.min(num1, num2);
        max = Math.max(num1, num2);
        /*
        for(i = 2; i < num; i++)
        {
            if(num % i == 0)
            {
                prime = false;
                break;
            }
        }
        if(prime)
        {
            System.out.println("Yes, "+num+" is a Prime Number.");
        }
        else
        {
            System.out.println("No!, "+num+" is Not a Prime Number.");
        }
*/

    }
}
