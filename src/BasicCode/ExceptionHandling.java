package BasicCode;

import java.util.Scanner;

//ExceptionHandling

// class representing custom exception
//class InvalidAgeException extends Exception {
//    public InvalidAgeException(String str) {
//        // calling the constructor of parent Exception
//        super(str);
//    }
//}
//
//// class that uses custom exception InvalidAgeException
//public class ExceptionHandling {
//    static void validate(int age) throws InvalidAgeException {
//        if (age < 18) {
//            throw new InvalidAgeException("age is not valid to vote"); // throw an object of user defined exception
//        } else {
//            System.out.println("welcome to vote");
//        }
//    }
//
//    public static void main(String args[]) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your age in years: ");
//        int age = input.nextInt();
//        try {
//            // calling the method
//            validate(age);
//        } catch (InvalidAgeException e) {
//
//            // printing the message from InvalidAgeException object
//            System.out.println("Exception occurred: " + e.getMessage());
//        }
//
//        System.out.println("rest of the code...");
//    }
//}

class NotEligibleException extends Exception {
    NotEligibleException(String msg) {
        super(msg);
    }
}

// Custom Exception
public class ExceptionHandling {

//    static void checkEligibility(int age) {
//        try {
//            if (age < 18) {
//                throw new NotEligibleException("Error: Not eligible for vote due to under age.");
//            }
//            System.out.println("Congrates! You are eligible for vote.");
//        } catch (NotEligibleException nee) {
//            System.out.println(nee.getMessage());
//        }
//    }

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age in years: ");
        int age = input.nextInt();
//        checkEligibility(age);
        try {
            if (age < 18) {
                throw new NotEligibleException("Error: Not eligible for vote due to under age.");
            }
            System.out.println("Congrates! You are eligible for vote.");
        } catch (NotEligibleException nee) {
            System.out.println(nee.getMessage());
        }
    }
}