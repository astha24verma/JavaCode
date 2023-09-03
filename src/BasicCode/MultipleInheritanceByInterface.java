package BasicCode;

interface InterfaceI1{
    int a = 15;
    void methodM1();
    void methodM2();
}
interface InterfaceI2{
    void methodM3();
    void methodM4();
}
interface InterfaceI3 extends InterfaceI1, InterfaceI2{
    void methodM1();
    void methodM3();
    default void methodM6(){
        System.out.println("Method 6");
    }

}
class SampleClassC1 implements InterfaceI3{
    public void methodM1(){
        System.out.println("Method 1 of InterfaceI1");
    }
    public void methodM2(){
        System.out.println("Method 2 of InterfaceI1");
    }
    public void methodM3(){
        System.out.println("Method 3 of InterfaceI2");
    }
    public void methodM4(){
        System.out.println("Method 4 of InterfaceI2");
    }
    void methodM5(){
        System.out.println("Method 5 of this SampleClass");
    }
}

public class MultipleInheritanceByInterface {
    public static void main(String[] args) {
        SampleClassC1 objC1 = new SampleClassC1();
        objC1.methodM1();
        objC1.methodM3();
        objC1.methodM5();
        objC1.methodM6();
    }
}
