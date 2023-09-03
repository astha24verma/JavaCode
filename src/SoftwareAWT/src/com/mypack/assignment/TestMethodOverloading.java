//30.0:  Write a program that has a overloaded method. The first method should accept no
//        argument the second method will accept one string and the third method will accept an integer.
//        The first method should display the message as -"An Abstract class must be Inherit by other
//        class" once .The second method should display the message ― "One Name and its multiple form
//        is called Polymorphism" twice. The third method should display the message ―"When we have
//        more than one method with same name and different number of argument or type –called method
//        overloading" three times.
package com.mypack.assignment;

class MethodOverloading{
    public void display(){
        System.out.println("An Abstract class must be Inherit by other class");
    }
    public void display(String value){
        for (int i = 0; i<=1; i++){
            System.out.println("One Name and its multiple form is called Polymorphism");
        }
    }
    public void display(int n){
        for (int i = 0; i<=2; i++){
            System.out.println("When we have more than one method with same name and different" +
                    " number of argument or type called method overloading");
        }
    }

}


public class TestMethodOverloading {
    public static void main(String[] args) {
        MethodOverloading meth1 = new MethodOverloading();
        meth1.display();
        meth1.display("print");
        meth1.display(7);

    }
}
