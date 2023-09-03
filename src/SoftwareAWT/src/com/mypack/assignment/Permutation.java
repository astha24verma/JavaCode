//26.0:  Write a program using class and object to implement permutation
//        P (n, r) =n! / (n-r)!
//package SoftwareAWT.src.com.mypack.assignment;
//
//import java.util.Scanner;
//
//public class Permutation extends Calc {
//    int n, r;
//    double per;
//
//    public Permutation(int n, int r) {
//        this.n = n;
//        this.r = r;
//    }
//
//    public void getPermutation() {
//        int d;
//        d = n - r;
//        per = factorial(n) / factorial(d);
//        System.out.println("Permutation : " + per);
//
//    }
//
//    public static void main(String[] args) {
//        int n, r;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter total number of items (n) : ");
//        n = sc.nextInt();
//        System.out.print("Enter item taken (r) for permutation : ");
//        r = sc.nextInt();
//        Permutation p1 = new Permutation(n, r);
//        p1.getPermutation();
//    }
//}
