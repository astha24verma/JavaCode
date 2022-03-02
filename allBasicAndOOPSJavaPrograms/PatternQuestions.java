package com.company.allBasicAndOOPSJavaPrograms;

public class PatternQuestions {
    public static void main(String[] args) {
        int n = 3;
        //Diamond Pattern
        //        *
        //      * * *
        //    * * * * *
        //  * * * * * * *
        //    * * * * *
        //      * * *
        //        *

//        for (int i = 0; i < n; i++) {
//            for (int j = n-i+1; j >= 1 ; j--) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= 2*(i)+1 ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        for (int i = n; i >= 0; i--) {
//            for (int j = n-i+1; j >= 1 ; j--) {
//                System.out.print("  ");
//            }
//            for (int j = 1; j <= 2*(i)+1 ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        // Palindrome Patter Pyramid
        //        1
        //      2 1 2
        //    3 2 1 2 3
        //  4 3 2 1 2 3 4

//        for (int i = 1; i <= n ; i++) {
//            for (int j = 1; j <= n-i+1; j++) {
//                System.out.print("  ");
//            }
//            for (int j = i; j >= 1 ; j--) {
//                System.out.print(j+" ");
//            }
//            for (int j = 2; j <= i ; j++) {
//                System.out.print(j+" ");
//            }
//
//            System.out.println();
//        }

        // Number Pyramid
        //    1
        //   2 2
        //  3 3 3
        // 4 4 4 4

//        for (int i = 1; i <= n ; i++) {
//            for (int j = 1; j <= n-i+1 ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= i ; j++) {
//                System.out.print(i);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }



        //    Hollow Rhombus
//          *  *  *  *  *
//        *           *
//      *           *
//    *           *
//  *  *  *  *  *

//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= n-i ; j++) {
//                System.out.print("  ");
//            }
//            if(i == 0 || i == 4){
//                for (int j = 0; j <= n ; j++) {
//                    System.out.print("*  ");
//                }
//            }
//            else{
//                System.out.print("*  ");
//                for (int j = 0; j <= n-1 ; j++) {
//                    System.out.print("  ");
//                }
//                System.out.print(" *");
//            }
//            System.out.println();
//        }

/*
       Solid Rhombus
          * * * * *
        * * * * *
      * * * * *
    * * * * *
  * * * * *
  */
//
//        for (int i = 0; i <= n; i++) {
//            for (int j = 0; j <= n-i ; j++) {
//                System.out.print("  ");
//            }
//            for (int j = 0; j <= n ; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }


        /*  // Butterfly Pattern
            *                    *
            *  *              *  *
            *  *  *        *  *  *
            *  *  *  *  *  *  *  *
            *  *  *  *  *  *  *  *
            *  *  *        *  *  *
            *  *              *  *
            *                    *
                                                       */
//           for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("*  ");
//            }
//            for (int j = 1; j <= 2*(n-i) ; j++) {
//                System.out.print("   ");
//            }
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("*  ");
//            }
//            System.out.println();
//        }
//        for (int i = n; i >= 1; i--) {
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("*  ");
//            }
//            for (int j = 1; j <= 2*(n-i) ; j++) {
//                System.out.print("   ");
//            }
//            for (int j = 1; j <= i ; j++) {
//                System.out.print("*  ");
//            }
//            System.out.println();
//        }

    }
}
