package BasicCode;

import java.util.Scanner;

public class SumOfCubeOfDigits {
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
        System.out.print("Enter a Number To get Sum of Cube of it's Digits : ");
        int num = sc.nextInt();
        SumOfCubeOfDigits ob = new SumOfCubeOfDigits();
        int s = ob.sumCubeDigits(num);
        System.out.println("Sum of Cube of Digits of "+num+" is "+s);

    }
}
