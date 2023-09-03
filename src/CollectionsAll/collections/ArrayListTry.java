package com.company.collections;

 //       Set, List, Map, SortedSet, SortedMap, HashSet, TreeSet, ArrayList, LinkedList, Vector, Collections, Arrays, AbstractCollection
import java.util.ArrayList;

public class ArrayListTry {
    public static void main(String[] args) {
        try{
            ArrayList<Integer> l1 = new ArrayList<>();
            l1.add(4);
            l1.add(5);
            for (Integer i : l1) {             //for each loop : )
                System.out.println(i);         // remember sout(i)
            }
        }
        catch(Exception e){
            System.out.println(Exception.class);
        }

    }
}
