//18.0  Implement the following integer methods:
//        a) Method Celsius returns the Celsius equivalent of a Fahrenheit temperature, using the
//        calculation Celsius = 5.0 / 9.0 * ( Fahrenheit - 32 );
//        b) Method Fahrenheit returns the Fahrenheit equivalent of a Celsius temperature, using the
//        calculation Fahrenheit = 9.0 / 5.0 * Celsius + 32;
//        c) Use the methods from parts (a) and (b) to write an application that enables the user either to
//        enter a Fahrenheit temperature and display the Celsius equivalent or to enter a Celsius
//        temperature and display the Fahrenheit equivalent.
package com.mypack.assignment;

import java.util.Scanner;

class ConvertTemperature{

    public double Celsius(double fahrenheit){
        double celsius;
        celsius = 5.0 / 9.0 * ( fahrenheit - 32 );
        return celsius;
    }
    public double Fahrenheit(double celsius){
        double fahrenheit;
        fahrenheit = 9.0 / 5.0 * celsius + 32;
        return fahrenheit;
    }
}

public class Temperature {
    public static void main(String[] args) {
        String convoTo;
        double temp;
        Scanner sc = new Scanner(System.in);
        ConvertTemperature t1 = new ConvertTemperature();
        System.out.print("Convert To celsius / fahrenheit - choose c / f ");
        convoTo = sc.next();

        if (convoTo.equals("c")){
            System.out.print("Enter Temperature in Fahrenheit: ");
            temp = sc.nextDouble();
            System.out.println("Temperature in Celsius is : "+t1.Celsius(temp));
        }
        else{
            System.out.print("Enter Temperature in Celsius : ");
            temp = sc.nextDouble();
            System.out.println("Temperature in Fahrenheit is : "+t1.Fahrenheit(temp));
        }

    }
}
