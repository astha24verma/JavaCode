package BasicCode;

import java.util.Scanner;

public class PrimeNumber {           // n > 1 (1 is neither prime nor composite), n is divisible by 1 and number itself.
                                     // eg. 2, 3, 5, 7, 11, 13, 17, ...
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to Check whether it is a Prime Number or Not : ");
        int num = sc.nextInt();
        int i;
        boolean prime = true ;
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


    }
}
