//27.0: Write a program for following triangle the output will be
//        1
//        1 1
//        1 2 2
//        1 3 3 3
//        1 4 4 4 4
package com.mypack.assignment;

public class TriPattern {

    public static void main(String[] args) {
        int j, i,c;
        for (i = 1; i <= 5; i++){
            if (i == 1)
                System.out.print("1" + " ");
            for (j = 1; j < i; j++){

                if (j == 1)
                    System.out.print("1" + " ");

                if(i>1)
                    System.out.print(i-1+" ");
            }
            System.out.println();
        }
    }
}

