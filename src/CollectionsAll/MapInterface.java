package com.company.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/*
 Map Interface: A map is a data structure that supports the " key-value pair " mapping for the data.
               This interface does not support duplicate keys
               because the same key cannot have multiple mappings.
                           Map<T> hm = new HashMap<> ();
                           Map<T> tm = new TreeMap<> ();
                           Where T is the type of the object.

 Map interface is implemented by classes :
 HashMap -->{ It stores the data in (Key, Value) pairs.
              To access a value in a HashMap, we must know its key.
              HashMap uses a technique called Hashing.
              HashSet also uses HashMap internally. }
 TreeMap -->  { Complex hai }

 */
public class MapInterface {
    public static void main(String[] args) {
        HashMap<Integer, String > student = new HashMap<>();

        student.put(1, "Astha");
        student.put(2, "Shweta");
        student.put(3, "Rishabh");
        student.put(5, "Tripty");
        student.put(8, "Megha");

        for (int i: student.keySet()) {
            System.out.print(i +" ");
        }
        System.out.println();
        System.out.println(student);

        // Finding the value for a key
        System.out.println("Student having Roll Number 1 is " + student.get(1));

        // Traversing through the HashMap
        for (Map.Entry<Integer, String> e : student.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }

}

