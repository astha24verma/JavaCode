package BasicCode;

import java.util.Scanner;

public class AutomorphicNumber {     //number whose square ends with the same digits as the original number
                                     // 5, 6, 76, 376 ....( 5^2 = 25, 6^2 = 36, etc. )
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a number to Check whether it is a Automorphic Number or Not : ");
       int num = sc.nextInt();
       int orgNum = num;
       int sq, r, c = 0, op, res ;

       sq = num * num;

       while(num!=0)
       {
           r = num % 10;
           num = num / 10;
           c ++;                 // counts the length of digit
       }

       op = (int)Math.pow(10,c);       // gives 10 or 100 or 1000 or ....

       res = sq % op;

       if(res == orgNum)
       {
           System.out.println("Yes, "+orgNum+" is a Automorphic Number.");
       }
       else
       {
           System.out.println("No!, "+orgNum+" is Not a Automorphic Number.");
       }



   }
}
