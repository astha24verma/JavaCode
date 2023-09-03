package CollectionsAll.collections;

import java.util.*;

public class HashmapEg {
    public static void main(String[] args) {
        int n = 4;
        int[] arr = {1, 1, 2, 5};
        int m = 4;
        int[] brr = {1, 2, 3, 4};

        Set<Integer> list = new HashSet<>();

        HashMap<Integer, Integer> m1= new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(m1.containsKey(arr[i])){
                m1.put(arr[i], m1.get(arr[i]) + 1);
            }else{
                m1.put(arr[i], 1);
            }
        }

        HashMap<Integer, Integer> m2= new HashMap<>();
        for (int i = 0; i < brr.length; i++) {
            if(m2.containsKey(brr[i])){
                m2.put(brr[i], m2.get(brr[i]) + 1);
            }else{
                m2.put(brr[i], 1);
            }
        }

        for (int key: m2.keySet()) {
            if(m1.containsKey(key)){
                if(!(m2.get(key) == m1.get(key))){
                    list.add(key);
                }
            }else{
                list.add(key);
            }
        }

        System.out.println(list);

    }
}
