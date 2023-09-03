package BasicCode;

import java.util.Scanner;

public class PerfectSquareNumber {                   //eg. 4, 9, 16, 25, .. i.e. 4 = 2*2 -->Square of an integer(i.e 2).
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to Check whether it is a Perfect Square or Not : ");
        int num = sc.nextInt();

        double x = Math.sqrt(num);

        if(x == (int)x)     //if value of x = integer part of x (i.e => 5 = (int)5.0 ...) or not ( 5 = (int)5.09901..)
        {
            System.out.println("Yes, "+num+" is a perfect square.");

          //  System.out.print("Since, "+num + " is square of "+(int)x);
        }
        else
        {
            System.out.println("No!, "+num+" is not a perfect square.");
        }
    }
}

