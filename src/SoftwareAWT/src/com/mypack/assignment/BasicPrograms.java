/*
12.0  Write a Java statement or a set of Java statements to accomplish each of the following tasks:
        a) Sum the odd integers between 1 and 99, using a for statement. Assume that the integer
        variables sum and count have been declared.
        b) Calculate the value of 2.5 raised to the power of 3, using the pow method.
        c) Print the integers from 1 to 20, using a while loop and the counter variable i. Assume that the
        variable i has been declared, but not initialized. Print only five integers per line
            [Hint: Use the calculation i%5.When the value of this expression is 0,print a newline character;
            otherwise, print a tab character. Assume that this code is an application. Use the
            System.out.println() method to output the newline character, and use the System.out.print( '\t' )
             method to output the tab character.]
        d) Repeat part (c), using a for statement
*/
package SoftwareAWT.src.com.mypack.assignment;

class CalcNum{
    int sum = 0, count = 0, i;

    public void displayOddSum(){
        for (i = 1; i<=100; i++){
            if (i % 2 != 0){
                sum = sum + i;
            }
        }
        System.out.println("Sum of odd integers between 1 and 99 : "+ sum);
    }

    // (b)
    public void displayPower(){
        double p = Math.pow(2.5, 3);
        System.out.println("The value of 2.5 raised to the power of 3 : "+ p);
    }

    // (c)
    public void PrintInt() {
        int i = 1;
        System.out.println("Integers from 1 to 20 :- ");
        while (i <= 20) {
            System.out.print(i +" ");
            if (i % 5 == 0) {
                System.out.println();
            }
            i ++;
        }

        // (d) using for loop
        for (i = 1; i<=20; i++){
            System.out.print(i +" ");
            if (i % 5 == 0) {
                System.out.println();
            }
        }
    }
}


public class BasicPrograms {
    public static void main(String[] args) {
        CalcNum n1 = new CalcNum();
        n1.displayOddSum();
        n1.displayPower();
        n1.PrintInt();
    }
}
