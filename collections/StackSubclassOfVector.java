package com.company.collections;

/*
 Stack --> the subclass of Vector(that implements List interface).
 */
import java.util.Iterator;
import java.util.Stack;

public class StackSubclassOfVector {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(4);
        s.push(1);
        s.push(7);
        s.push(9);
        s.push(3);
        s.push(8);


        // Iterator for the stack    -->  root interface for the entire collection framework
        // this interface contains only one abstract method --> iterator()
        Iterator<Integer> itr = s.iterator();
        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        System.out.println();
        //Remove element from top
        s.pop();

        itr = s.iterator();
        // Printing the stack
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

    }
}
