package com.company.basicCode;

class Customer {
    private String customerId;
    private String customerName;
    private long contactNumber;
    private String address;

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public void displayCustomerDetails() {
        System.out.println("Displaying customer details \n***********");
        System.out.println("Customer Id : " + customerId);
        System.out.println("Customer Name : " + customerName);
        System.out.println("Contact Number : " + contactNumber);
        System.out.println("Address : " + address);
        System.out.println();
    }
}
public class TesterEA {
    public static void main(String[] args) {
        Customer customer = new Customer();

        customer.setCustomerId("C201");
        customer.setCustomerName("Rishabh Singh");
        customer.setContactNumber(9870345687L);
        customer.setAddress("345, Indira Nagar, Lucknow, 226025");

        System.out.println("Displaying Customer Details");

        System.out.println("Customer Id : " + customer.getCustomerId());
        System.out.println("Customer Name : " + customer.getCustomerName());
        System.out.println("Contact Number : " + customer.getContactNumber());
        System.out.println("Address : " + customer.getAddress());

        //Alternate way
//        customer.displayCustomerDetails();
    }
}
