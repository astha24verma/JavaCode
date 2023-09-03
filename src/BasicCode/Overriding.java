package com.company.basicCode;

class Overriding {

    public static void main(String[] args) {

        Customer_s customer = new Customer_s();
//        Parent Reference -> Parent Object
        System.out.println("Final bill amount: "+customer.payBill(40.0));


         RegularCustomer regularCustomer = new RegularCustomer();
//         Child Reference -> Child Object
         System.out.println("Final bill amount: "+regularCustomer.payBill(40.0));


        Customer_s regCust = new RegularCustomer();
//         Parent Reference -> Child Object
        System.out.println("Final Bill : " + regCust.payBill(40.0));
    }
}

class Customer_s {

    public double payBill(double totalPrice) {
        System.out.println("Final bill for the customer is calculated here");
        return totalPrice;
    }
}

class RegularCustomer extends Customer_s {

    @Override
     public double payBill(double totalPrice) {
        System.out.println("Final bill for the regular customer is calculated here");
        double priceAfterDiscount = totalPrice * (1 - (5f / 100));
        return priceAfterDiscount;
    }

}