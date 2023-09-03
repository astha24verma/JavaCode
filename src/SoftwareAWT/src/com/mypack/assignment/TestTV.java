//31.0: Create a class called TV with following attribute. name of company and screen size using
//        super keyword and Inheritance to create a class ColorTV, it has a attribute TVtype also create a
//        BWTV class, it also has attribute TVtype attribute in Boolean data type.
package com.mypack.assignment;

class TV{
    String companyName;
    float screenSize;
    public void displayDescription(){
        System.out.println("TV Company : "+companyName);
        System.out.println("TV Screen Size : "+screenSize);
    }
}
class ColorTV extends TV{
    boolean TVtype;
    public void displayDescription(){
        System.out.println("TV Company : "+companyName);
        System.out.println("TV Screen Size : "+super.screenSize);
    }

}
class BWTV extends TV{
    boolean TVtype;
    public void displayDescription(){
        System.out.println("TV Company : "+companyName);
        System.out.println("TV Screen Size : "+super.screenSize);
    }
}

public class TestTV {
    public static void main(String[] args) {
        TV sony = new TV();

    }
}
