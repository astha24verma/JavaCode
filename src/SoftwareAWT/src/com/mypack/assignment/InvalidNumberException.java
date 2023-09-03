//38.0: Create a user-defined exception class named InvalidNumberException in package
//        YourName.mypackage.
//49.0: The display( ) method explicitly throws the exception throws InvalidNumberException with the
//        String argument ―Negative number not allowed", when negative marks are entered.
//40.0: The display( ) method also throws IllegalArgumentException with the String argument
//        ―Above 100 not allowed", when 100 is entered.
package com.mypack.assignment;

import java.util.Scanner;

public class InvalidNumberException extends Exception {

    public void display(int marks ) throws InvalidNumberException, IllegalArgumentException{
        if (marks < 0){
            throw new InvalidNumberException();
        }
        if (marks > 100){
            throw new IllegalArgumentException("Above 100 not allowed");
        }
        else
            System.out.println("Marks of subject :"+marks);
    }

    public static void main(String[] args) {
        int marks = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of subject : ");
        try {
            marks = sc.nextInt();
        }
        catch (IllegalArgumentException e){
            System.out.println("Above 100 not allowed");
        }

        InvalidNumberException s1 = new InvalidNumberException();
        try {
            s1.display(marks);
        }
        catch (InvalidNumberException e){
            System.out.println("Negative number not allowed");
        }
        catch (IllegalArgumentException e){
            System.out.println("Above 100 not allowed");
        }

    }
}
