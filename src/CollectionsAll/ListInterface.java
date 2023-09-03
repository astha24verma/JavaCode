package com.company.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
 Set, List, Map, SortedSet, SortedMap, HashSet, TreeSet, ArrayList, LinkedList, Vector, Collections, Arrays, AbstractCollection

 'List Interface': is a child interface of the collection interface.

                    List <T> al = new ArrayList<> ();
                    List <T> ll = new LinkedList<> ();
                    List <T> v = new Vector<> ();

 The classes which implement the 'List interface' are :--
  ArrayList
  LinkedList
  Vector( Stack : the subclass of Vector )
*/

public class ListInterface {
    public static void main(String[] args) {
        try{

            ArrayList<Integer> l1 = new ArrayList<>();
            //LinkedList<Integer> l1 = new LinkedList<>();
            //Vector<Integer> l1 = new Vector<Integer>()

            l1.add(4);
            l1.add(5);
            l1.add(7);
            l1.add(9);
            l1.add(3);
            l1.add(1);

            System.out.println(l1);

            l1.remove(3);

            // For Iterating
            System.out.println(l1);

            Collections.reverse(l1);

            for (Integer i : l1) {             //for each loop :)
                System.out.print(i +" ");
            }
            System.out.println(" ");

            for(int i = 0; i < l1.size(); i++){
                System.out.print(l1.get(i)+" ");
            }
        }
        catch(Exception e){
            System.out.println(Exception.class);
        }

    }
}
