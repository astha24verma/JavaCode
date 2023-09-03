package com.company.collections;

import java.util.PriorityQueue;

/*
 Queue Interface: is a child interface of the collection interface.
                        Queue <T> pq = new PriorityQueue<> ();
                        Queue <T> ad = new ArrayDeque<> ();
                        (Where T is the type of the object.)
 subclasses implementing queue :
  PriorityQueue --> is used when the objects are supposed to be processed based on the priority.
  ArrayDeque(in deque interface )


*/
public class QueueInterface {
    public static void main(String[] args) {
        // Creating empty priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(10);
        pq.add(5);
        pq.add(7);
        pq.add(8);
        pq.add(12);

        System.out.println(pq);

        // Printing the top element of PriorityQueue
        System.out.println(pq.peek());

        // Printing the top element and removing it
        // from the PriorityQueue container
        System.out.println(pq.poll());

        // Printing the top element again
        System.out.println(pq.peek());
        System.out.println(pq);
    }

}

