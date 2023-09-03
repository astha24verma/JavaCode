package com.company.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/*
 Set Interface: A set is an unordered collection of objects in which duplicate values cannot be stored.
                              Set<T> hs = new HashSet<> ();
                              Set<T> lhs = new LinkedHashSet<> ();
                              Set<T> ts = new TreeSet<> ();
                              Where T is the type of the object.
 Set interface is implemented by various classes :
  HashSet --> The objects are inserted based on their hashcode. (Asc order - sort)
  LinkedHashSet --> A LinkedHashSet is very similar to a HashSet.
                   The difference is that this uses a doubly linked list to store the data
                   and retains the ordering of the elements.
  TreeSet(in Sorted Set Interface )
 */
public class SetInterface {
    public static void main(String[] args) {
        //HashSet<Integer> hs = new HashSet<>();
        LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
        hs.add(4);
        hs.add(6);
        hs.add(8);
        hs.add(2);
        hs.add(12);

        System.out.println(hs);

        hs.remove(2);

        System.out.println(hs);

        // Traversing elements
        Iterator<Integer> itr = hs.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
    }
}
