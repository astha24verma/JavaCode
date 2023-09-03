//13.0  An online retailer sells five products whose retail prices are as follows: Product 1, $2.98;
//        product 2, $4.50; product 3, $9.98; product 4, $4.49 and product 5, $6.87. Write an application
//        that reads a series of pairs of numbers as follows:
//        a) Product number
//        b) Quantity sold
//        Your program should use a switch statement to determine the retail price for each product. It
//        should calculate and display the total retail value of all products sold. Use a sentinel-controlled
//        loop to determine when the program should stop looping and display the final results.
package com.mypack.assignment;

import java.util.Scanner;

class CalRetailPrice{
    int num, quantity;
    double price;

    public int calPrice(int num){
        return 0;
    }

    public double calPrice(int num, int quant){
        this.num = num;
        this.quantity = quant;
        switch (num){
            case 1 : price = quantity * 2.98;
            break;
            case 2 : price = quantity * 4.50;
            break;
            case 3 : price = quantity * 9.98;
            break;
            case 4 : price = quantity * 4.49;
            break;
            case 5 : price = quantity * 6.87;
            break;
            default:
        }
        return price;
    }
}

public class OnlineRetailShop {
    public static void main(String[] args) {
        System.out.println("Product -> Retail price :- \n" +
                "Product 1, $2.98\n" +
                "Product 2, $4.50\n" +
                "product 3, $9.98\n" +
                "product 4, $4.49\n" +
                "product 5, $6.87");
        int n = 0, q = 0, flag = 0;
        double total= 0.0;
        Scanner sc = new Scanner(System.in);
        CalRetailPrice customer1 = new CalRetailPrice();
        System.out.println("Enter -1 in Product number anytime to Stop Calculating Price.");
        while (n>=0){
            System.out.print("Enter Product number : ");
            n = sc.nextInt();
            if (n>0){
                System.out.print("Enter Quantity of Product "+n+" : ");
                q = sc.nextInt();
                total = total + customer1.calPrice(n, q);
            }
            else{
                total = total + customer1.calPrice(n);
                break;
            }
        }
        System.out.println("Total retail value : "+ total);
    }
}