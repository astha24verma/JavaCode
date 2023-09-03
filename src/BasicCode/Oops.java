package BasicCode;


class BaseClass{                             // --> "Inheritance" Concepts
    int x;
    public BaseClass(){                    // constructor of base class
        System.out.println("Hello, I am Base Class constructor. ");
    }

    public BaseClass(String name){  System.out.println("Hello "+name+", I am Base Class constructor. "); }
             // --> Constructor Overloading

    public int baseAddFive(int n){
        int sum = n + 5;
        return sum;
    }
}

class DerivedClass extends BaseClass{

    public DerivedClass(){
        System.out.println("Hello, I am Derived Class Constructor. ");
    }
    public DerivedClass(String name) {        // --> Constructor Overloading
        super(name);        //Getting the name from Base / Parent Class
                            // --> NOTE : it will not call default constructor BUT 'parameterized constructor'
        System.out.println("Hello "+name+", I am Derived Class ' 'Overloaded' ' Constructor. ");
    }
}

abstract class SampleAbstractClass{       //Abstract Class -> class whose instance( object ) cannot be made
    abstract void method1();
    abstract void method2();
    void method3(){
        System.out.println(" I am Method 3 of Abstract Class.");
    }
}

class BaseClassConcrete extends SampleAbstractClass{      //Abstract class's abstract methods have to implemented
    // inside concrete class extending it.
    // Else make this class abstract as well
    @Override
    void method1() {
        System.out.println(" I am Method 1 of Abstract Class... which is being implemented here( --> baseClassConcrete )");
    }

    @Override
    void method2() {
        System.out.println(" I am Method 2 of Abstract Class... which is being implemented here( --> baseClassConcrete )");
    }
}


interface SampleInterface1 {
    int x = 5;       // final  --> All properties of interface are "final"
    void meth1();
    void meth2();
    }

interface SampleInterface2 {

    void meth3();
    default void meth4() {
        System.out.println(" --> This is Default method of interface.(Method 4)");
    }
// " default "--> To add ( new functionality to interface ) extra method to All the classes that are implementing this interface.
}

class SampleBase implements SampleInterface1, SampleInterface2{
       // Interface
    public void meth1() {
        System.out.println("This is method 1.");
    }
    public void meth2() {
        System.out.println("This is method 2.");
    }
    public void meth3(){
        System.out.println("This is method 3.");
    }
    // Method 4 is default
}

interface SampleInterface3 extends SampleInterface2{                 // --> Inheritance in interface
    void meth5();
    void meth6(int num);
}

class SampleBase3 implements SampleInterface3{
    public void meth3(){
        System.out.println("This is method 3.");
    }
    public void meth5(){
        System.out.println("This is method 5.");
    }
    public void meth6(int num){
        System.out.println("This is method 6. Taking input as double : "+ num);
    }

}

// ------------------------------------ Main Class -----------------------------------------------------

public class Oops {
    public static void main(String[] args) {
        BaseClass b = new BaseClass();
        System.out.println(b.baseAddFive(6));

        DerivedClass d1 = new DerivedClass();
        System.out.println(d1.baseAddFive(6));

        DerivedClass d3 = new DerivedClass();
        System.out.println(d3.baseAddFive(6));

        BaseClass b1 = new BaseClass("Jerry");

        DerivedClass d4 = new DerivedClass();
        DerivedClass d5 = new DerivedClass("Timmy");


        SampleBase sb = new SampleBase();
        sb.meth1();
        sb.meth2();
        sb.meth3();
        sb.meth4();

        SampleBase3 sb3 = new SampleBase3();
        sb3.meth6(7888);
        BaseClassConcrete bcc = new BaseClassConcrete();
        bcc.method3();
        bcc.method1();
        bcc.method2();

    }

}
