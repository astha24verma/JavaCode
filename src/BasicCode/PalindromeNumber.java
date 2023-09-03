package BasicCode;

import java.util.Scanner;

public class PalindromeNumber {         //a number that is same after reverse --> 121 = 121
                                        // eg. 121, 34543, 101, 2442, ...
        int revNum(int n)
        {
            int r, s = 0;
            while(n != 0)
            {
                r = n % 10;
                n = n / 10;
                s = s * 10 + r;
            }
            return s;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a Number to Check whether it is a Palindrome Number or Not : ");
            int num = sc.nextInt();
            PalindromeNumber ob = new PalindromeNumber();
            int rev = ob.revNum(num);
            if(rev==num)
            {
                System.out.println("Yes, "+num+" is a Palindrome Number.");
            }
            else
            {
                System.out.println("No!, "+num+" is not a Palindrome Number.");
            }
        }

    }
