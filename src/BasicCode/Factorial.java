package BasicCode;
import java.util.Scanner;

/** Factorial class to calculate factorial of a number
 * @author : Astha
 * @version : 1.0
 * @since : 2020
 */

public class Factorial {                   // 5! = 5 * 4 * 3 * 2 * 1

    /**
     *
     * @param args : Argument
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to calculate Factorial : ");
        int num = sc.nextInt();
        Factorial ob = new Factorial();
        int f = ob.fact(num);
        System.out.println("Factorial of "+num+ " is "+f);
    }

    /**
     * Calculates --  For eg. 5! = 5 * 4 * 3 * 2 * 1
     * @param n : Number you provide
     * @return : Factorial of number that you gave
     *
     */
    int fact(int n)
    {
        int res = 1 ;
        while(n!=0)
        {
            res = res * n;
            n--;
        }
        return res;


   /*
        if(n==0)                         // Using Recursion
        {
            return 1;
        }
        else
        {
            return (n * fact(n-1));
        }           */

    }

}
