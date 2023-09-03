//20.0 Write a Java application that uses looping to print the following table of values:
//       N             10*N             100*N              1000*N
//      1               10              100                 1000
//      2               20              200                 2000
//      3               so on .......
//      4
//      5
package com.mypack.assignment;

public class PrintTable {
    public static void main(String[] args) {
        int i,j;
        System.out.println("    N       10*N    100*N       1000*N");
        for (i = 1; i <= 5; i++){
                System.out.println(" \t"+i+" \t\t"+i*10+" \t\t"+i*100+" \t\t"+i*1000);
        }
    }
}
