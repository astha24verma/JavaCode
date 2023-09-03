//33.0:  Create a class named NumberOfInstances having a method getInstanceCounter() which
//        simply returns the count of the number of instances created of the class.
//34.0:  An instance of the class NumberOfInstances should be created when we pass a commandline argument to it.
package com.mypack.assignment;

public class NumberOfInstances {

    static int count=0;

    public NumberOfInstances(int x){
        count++;
    }

    public int getInstanceCounter(){
        return count;
    }

    public static void main(String[] args) {

        NumberOfInstances o1 = new NumberOfInstances(26);
        System.out.println("Number of instances created : "+o1.getInstanceCounter());
        NumberOfInstances o2 = new NumberOfInstances(66);
//        System.out.println("Number of instances created : "+o2.getInstanceCounter());
        NumberOfInstances o3 = new NumberOfInstances(87);
        System.out.println("Number of instances created : "+o3.getInstanceCounter());
        NumberOfInstances o4 = new NumberOfInstances(432);
        System.out.println("Number of instances created : "+o4.getInstanceCounter());
    }
}
