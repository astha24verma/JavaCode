//25.0:  Write a java program to calculate distance traveled by a vehicle. The formula is Distance =
//        ut + 1/2 ((a t)^2) , where u is the initial velocity a is acceleration , t is time(Using Constructor and
//        method & if values are entered through keyboard)
package com.mypack.assignment;

import java.util.Scanner;

public class DistanceCalculator {
    double u, t, a, s;

    public DistanceCalculator (double u, double t, double a){
        this.u = u;
        this.t = t;
        this.a = a;
    }

    public void getDistance(){
        s = (u*t + (0.5*a*(Math.pow(t, 2))));
        System.out.println("Distance traveled by vehicle is : "+s+ " m ");
    }



    public static void main(String[] args) {
        double u, t, a;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial velocity (u) of Vehicle (in m/s) : ");
        u = sc.nextDouble();
        System.out.print("Enter time (t) of Vehicle (in s) : ");
        t = sc.nextDouble();
        System.out.print("Enter acceleration (a) of Vehicle (in m/(s^2)) : ");
        a = sc.nextDouble();

        DistanceCalculator v1 = new DistanceCalculator(u, t, a);
        v1.getDistance();

    }
}
