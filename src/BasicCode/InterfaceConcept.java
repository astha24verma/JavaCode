package BasicCode;

interface SampleInterfaceI1 {
    int a = 15;        //final

    void methodM1();

    void methodM2();
}

interface SampleInterfaceI2 {
    void methodM3();                         // Abstract Method

    void methodM4();

    default void defaultMethodHello() {       //-- Default method to
        // ''' Write The Body of Method ( i.e. Non Abstract Method ) '''
        // inside any interface for IF NEEDED  --
        System.out.println("Hello, I am default method of Interface 2");
    }

}

class SampleBaseClassB1 {
    int p, q;

    void getValues(int x, int y) {
        p = x;
        q = y;
    }

    void showValues() {
        System.out.println("p = " + p + " & q = " + q);
    }

    void methodM5() {
        System.out.println("Method 5 of 'this' SampleBaseClass");
    }


}

class SampleDerivedClassD1 extends SampleBaseClassB1 implements SampleInterfaceI1, SampleInterfaceI2 {
    int b = a;

    @Override
    public void methodM1() {
        System.out.println("Method 1");
    }

    @Override
    public void methodM2() {
        System.out.println("Method 2");
    }

    public void methodM3() {
        System.out.println("Method 3");
    }

    public void methodM4() {
        System.out.println("Method 4");
    }

    void methodM5() {
        System.out.println("Variable b = " + b);
        System.out.println("Method 5 of SampleBaseClass (overriding..)");
    }

    void methodM6() {
        System.out.println("Method 6 of 'this' SampleDerivedClass");
    }

}

public class InterfaceConcept {
    public static void main(String[] args) {

        SampleBaseClassB1 objB1 = new SampleBaseClassB1();
        objB1.getValues(6, 12);
        objB1.showValues();
        objB1.methodM5();


        SampleDerivedClassD1 objD1 = new SampleDerivedClassD1();
        System.out.println(objD1.a);
        objD1.getValues(3, 4);
        objD1.showValues();
        objD1.methodM2();
        objD1.methodM4();
        objD1.methodM5();
        objD1.methodM6();
        objD1.defaultMethodHello();
    }
}
