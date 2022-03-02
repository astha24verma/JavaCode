package com.company.collections;

import java.util.ArrayDeque;

/*
   Deque Interface: This interface extends the queue interface
                    Data structure where we can add and remove the elements from both ends of the queue
                               Deque<T> ad = new ArrayDeque<> ();
                               (Where T is the type of the object.)

    Class which implements Deque interface :
    ArrayDeque --> a special kind of array that grows and allows users to add or remove an element
                 from both sides of the queue
 */
public class DequeInterface {
    public static void main(String[] args) {
        // Initializing an deque
        ArrayDeque<Integer> dq = new ArrayDeque<Integer>();
        dq.add(3);
        dq.add(12);
        dq.add(6);
        dq.add(9);
        dq.add(15);
        System.out.println(dq);
        dq.addFirst(18);
        System.out.println(dq);
        dq.addLast(28);
        System.out.println(dq);

    }
}
