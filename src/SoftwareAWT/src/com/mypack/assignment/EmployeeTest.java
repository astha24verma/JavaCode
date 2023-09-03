//   4.0  Create a class called Employee that includes three instance variables—
//        a first name (type String), a last name (type String) and a monthly salary (double).
//        Provide a constructor that initializes the three instance variables.
//        Provide a set and a get method for each instance variable.
//        If the monthly salary is not positive, do not set its value.
//        Write a test application named EmployeeTest that demonstrates class Employee’s capabilities.
//        Create two Employee objects and display each object’s yearly salary.
//        Then give each Employee a 10% raise and display each Employee’s yearly salary again.

package com.mypack.assignment;

class Employee{
    String firstName;
    String lastName;
    double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary){
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {

        Employee E1 = new Employee("Rivana", "Sharma", 40000.0);
        System.out.println("Yearly Salary of " +E1.getFirstName()+ " is : "+ (E1.getMonthlySalary()*12));
        Employee E2 = new Employee("Rony", "Jaiswal", 28000.0);
        System.out.println("Yearly Salary of " +E2.getFirstName()+ " is : "+ (E2.getMonthlySalary()*12));

        //raise of 10% in the salary
        double raiseSal;
        raiseSal = E1.getMonthlySalary() + (E1.getMonthlySalary()*0.1);
        E1.setMonthlySalary(raiseSal);
        raiseSal = E2.getMonthlySalary() + (E2.getMonthlySalary()*0.1);
        E2.setMonthlySalary(raiseSal);
        System.out.println("Raised Yearly Salary of " +E1.getFirstName()+ " is : "+ (E1.getMonthlySalary()*12));
        System.out.println("Raised Yearly Salary of " +E2.getFirstName()+ " is : "+ (E2.getMonthlySalary()*12));
    }
}
