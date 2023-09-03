package BasicCode;

import java.util.Scanner;

public class ReverseNumber {
    int revNum(int n)
    {
        int r, s = 0;
        while(n!=0)
        {
            r = n % 10;
            n = n / 10;
            s = s * 10 + r;
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number To get Reverse of it : ");
        int num = sc.nextInt();
        ReverseNumber ob = new ReverseNumber();
        int rev = ob.revNum(num);
        System.out.println("Reverse of "+num+" is "+rev);

    }
}
