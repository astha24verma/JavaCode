package com.company.collections;

import java.util.Iterator;
import java.util.TreeSet;

/*
 Sorted Set Interface: This interface is very similar to the set interface.
                      The only difference is that this interface has extra methods that maintain the ordering of the elements.
                      The sorted set interface extends the set interface
                      and is used to handle the data which needs to be sorted.
                                  SortedSet<T> ts = new TreeSet<> ();
                                  Where T is the type of the object.
 The class which implements Sorted Set Interface :
 TreeSet --> uses a Tree for storage.
             The ordering of the elements is maintained by a set
             using their natural ordering whether or not an explicit comparator is provided.
 */
public class SortedSetInterface {
    public static void main(String[] args) {

        // Creating TreeSet and
        // adding elements
        TreeSet<Integer> ts = new TreeSet<Integer>();

        ts.add(8);
        //ts.add(8); --> not allowed Duplicate Value !!
        ts.add(5);
        ts.add(9);
        ts.add(10);

        // Traversing elements
        Iterator<Integer> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next()+" ");
        }
        System.out.println(" ");
        ts.remove(9);

        //Other Way
        for (Integer i : ts) {
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println(ts);
    }
}
