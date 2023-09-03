package BasicCode;

import java.util.Scanner;

public class SumOfSquareOfDigits {
    int sumSquareDigits(int n)
    {
        int r, sum = 0;
        while(n!=0)
        {
            r = n % 10;
            n = n / 10;
            sum = sum + r * r;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number To get Sum of Square of it's Digits : ");
        int num = sc.nextInt();
        SumOfSquareOfDigits ob = new SumOfSquareOfDigits();
        int s = ob.sumSquareDigits(num);
        System.out.println("Sum of Square of Digits of "+num+" is "+s);

    }

}
