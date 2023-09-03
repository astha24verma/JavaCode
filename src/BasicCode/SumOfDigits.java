package BasicCode;

import java.util.Scanner;

public class SumOfDigits {
    int sumDigits(int n)
    {
        int r, sum = 0;
        while(n!=0)
        {
            r = n % 10;
            n = n / 10;
            sum = sum + r;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number To get Sum of it's Digits : ");
        int num = sc.nextInt();
        SumOfDigits ob = new SumOfDigits();
        int s = ob.sumDigits(num);
        System.out.println("Sum of Digits of "+num+" is "+s);

    }
}
