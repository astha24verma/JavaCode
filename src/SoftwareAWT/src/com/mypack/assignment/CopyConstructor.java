//22.0:    Develop a program to illustrate a copy constructor so that a String may be duplicated into
//         another variable either by assignment or copying.
package SoftwareAWT.src.com.mypack.assignment;

import java.util.Scanner;

public class CopyConstructor {
    String value, copyValue;

    public CopyConstructor(String v) {
        value = v;
    }

    public CopyConstructor(CopyConstructor copy) {
        value = copy.value;
        copyValue = value + ", how's you doing.";
    }

    public void displayString() {
        System.out.println(copyValue);
    }


    public static void main(String[] args) {
        String input;
        System.out.print("Enter Your Name : ");
        Scanner sc = new Scanner(System.in);
        input = sc.next();

        CopyConstructor cp1 = new CopyConstructor(input);
        CopyConstructor cp2 = new CopyConstructor(cp1);

        cp2.displayString();

    }
}
