package BasicCode;

import java.util.Scanner;

public class InputName {
    public static void main(String[] args) {
        System.out.print("Enter Your Name : ");
        Scanner sc = new Scanner(System.in);
        String name  = sc.nextLine();    //stores more than one word ( Note: ** To store one word use sc.next() ** )
        System.out.println("Hey! " + name + ", Welcome to Java Programming : ) " );


    }
}
