//2.0
package SoftwareAWT.src.com.mypack.assignment;

public class Account {
    private double balance;
    public Account(double initialBalance){
        if ( initialBalance > 0.0)
            balance = initialBalance;
    }
    public void credit(double amount){
        balance = balance + amount;
    }
    public void debit(double amount){
        if(amount <= balance)
            balance = balance - amount;
        else
            System.out.println("Debit amount exceeded account balance.");
    }
    public double getBalance(){
        return balance;
    }

    public static void main(String[] args) {
        Account john = new Account(5000.0);
        System.out.println("Remaining Balance :"+john.getBalance());
        john.credit(500.0);
        System.out.println("Remaining Balance :"+john.getBalance());
        john.debit(200.0);
        System.out.println("Remaining Balance :"+john.getBalance());
        john.debit(40000.0);
        john.debit(700);
        System.out.println("Remaining Balance :"+john.getBalance());
    }
}
