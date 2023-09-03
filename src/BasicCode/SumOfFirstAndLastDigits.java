package BasicCode;

import java.util.Scanner;

public class SumOfFirstAndLastDigits {

    int sumFirstLastDigit(int n)
    {
        int r = 0;
        int last, sum = 0;
        last = n % 10;       // stores last digit ( First remainder )
        while(n!=0)
        {
            r = n % 10;
            n = n / 10;
        }
        sum = r + last;       //here r will store last remainder --> First Digit
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number To get Sum of First and Last Digits : ");
        int num = sc.nextInt();

        SumOfFirstAndLastDigits ob = new SumOfFirstAndLastDigits();
        int s = ob.sumFirstLastDigit(num);
        System.out.println("Sum of First and Last Digits  of "+num+" is "+s);


    }
}
