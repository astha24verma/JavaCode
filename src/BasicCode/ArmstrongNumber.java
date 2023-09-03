package BasicCode;

import java.util.Scanner;

public class ArmstrongNumber {     //number is equal to the "sum of cubes of its digits" --> 153 = ( 1^3 + 5^3 + 3^3 )
                                   //eg. 0, 1, 153, 370, 371, 407, ...
    int sumCubeDigits(int n)
    {
        int r, sum = 0;
        while(n!=0)
        {
            r = n % 10;
            n = n / 10;
            sum = sum + r * r * r;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number to Check whether it is an Armstrong Number or Not : ");
        int num = sc.nextInt();
        ArmstrongNumber ob = new ArmstrongNumber();
        int s = ob.sumCubeDigits(num);
        if(s==num)
        {
            System.out.println("Yes,"+num+" is an Armstrong Number.");
        }
        else
        {
            System.out.println("No!,"+num+" is not an Armstrong Number.");
        }



    }
}
