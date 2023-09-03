//16.0 Write a method quality Points that inputs a student’s average and returns
//        4 if it’s 90–100,
//        3 if 80–89,
//        2 if 70–79,
//        1 if 60–69 and
//        0 if lower than 60.
//        Incorporate the method into an application that reads a value from the user and displays the result.
package com.mypack.assignment;

import java.util.Scanner;

class CalPoint{
    public int qualityPoints(int a){
        if (a <= 100 && a >= 90){
            return 4;
        }
        else if (a <= 89 && a >= 80){
            return 3;
        }
        else if (a <= 79 && a >= 70){
            return 2;
        }
        else if (a <= 69 && a >= 60){
            return 1;
        }
        else
            return 0;
    }
}

public class StudentQualityPoints {
    public static void main(String[] args) {
        int avg;
        Scanner sc = new Scanner(System.in);
        CalPoint d1 = new CalPoint();
        System.out.print("Enter Your Average ( 0 to 100 ) : ");
        avg = sc.nextInt();
        System.out.println("Your Quality Point is : "+d1.qualityPoints(avg));
    }
}
