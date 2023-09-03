/*
 3.0    Create a class called Invoice that a hardware store might use to represent an invoice for an
        item sold at the store. An Invoice should include
        four pieces of information as instance variables—
        a part number (type String),
        a part description (type String),
        a quantity of the item being purchased(type int) and
        a price per item(double).
        Your class should have a constructor that initializes the four instance variables.
        Provide a set and a get method for each instance variable.
        In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e.,
        multiplies the quantity by the price per item), then returns the amount as a double value. If the
        quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set
        to 0.0.
    Write a test application named InvoiceTest that demonstrates class Invoice’s capabilities.
*/

package com.mypack.assignment;

class Invoice {
    String number;
    String description;
    int quantity;
    double price;

//    public Invoice(){
//        number = "";
//        description = "";
//        quantity = 0;
//        price = 0.0;
//    }

    public Invoice(String number, String description, int quantity, double price) {
        this.number = number;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        if (quantity < 0)
            quantity = 0;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
        if (price < 0)
            price = 0.0;
    }

    public double getInvoiceAmount(){
            return quantity * price;
    }

    public void displayInfo(){
        System.out.println("Invoice Number : "+number);
        System.out.println("Invoice Description : "+description);
        System.out.println("Quantity of the item : "+quantity);
        System.out.println("Price per item : "+price);
        System.out.println("Invoice Amount : "+getInvoiceAmount());
    }

}
public class InvoiceTest{

    public static void main(String[] args) {
        Invoice I1 = new Invoice("1000032","Superior quality", 3, 5000.4);
        System.out.println("Invoice Amount = "+ I1.getInvoiceAmount());
        I1.displayInfo();

    }

}
