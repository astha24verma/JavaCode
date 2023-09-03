//35.0: Create a class called UserDefinedException in a package named YourName.
//36.0: The class UserDefinedException contains an instance variable marks and an instance
//        method display( ) that prints marks.
//37.0: Use a parameterized constructor of UserDefinedException class to initialize marks with the
//        value, entered through the keyboard in the main( ) method of the class UserDefinedException.

package com.mypack.assignment;

import java.util.Scanner;


public class UserDefinedException {
    int marks;

    public UserDefinedException(int marks){
        this.marks = marks;
    }

    public void display( ){
        System.out.println("Marks of subject :"+marks);
    }

    public static void main(String[] args) {
        int marks;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks of subject : ");
        marks = sc.nextInt();

        UserDefinedException s1 = new UserDefinedException(marks);
        s1.display();
    }
}