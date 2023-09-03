package BasicCode;

import java.util.Scanner;

//Write a program to check if a string is palindrome or not.
public class P8CheckPalindromeString {
    public static void main(String[] args) {
        System.out.print("Enter a String : ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(checkPalindromeString(str)){
            System.out.println("String is a Palindrome.");
        }else{
            System.out.println("String is not a Palindrome.");
        }
    }

    public static boolean checkPalindromeString(String s) {
        int start = 0, end = s.length()-1;
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}
