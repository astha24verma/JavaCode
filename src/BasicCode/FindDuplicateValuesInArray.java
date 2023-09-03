package com.company.basicCode;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class FindDuplicateValuesInArray {
    public static void main(String[] args) {
        int arr[] = {3, 5, 3, 2, 4, 2};
        int count = 0, repeat;
        LinkedList<Integer> list = new LinkedList<>();

        while (count < arr.length){
            repeat = 0;
            for(int i = 0; i < arr.length; i++){
                if(arr[count] == arr[i]){
                    repeat++;
                }
            }
            if(repeat >= 2){
                if(!(list.contains(arr[count])))
                    list.add(arr[count]);
            }
            count++;
        }
        Collections.sort(list);
        System.out.println(list);

    }
}
//// code here
//        int count = 0, repeat;
//        ArrayList<Integer> list = new ArrayList<>();
//
//        while (count < arr.length){
//            repeat = 0;
//            for(int i = 0; i < arr.length; i++){
//                if(arr[count] == arr[i]){
//                    repeat++;
//                }
//            }
//            if(repeat >= 2){
//                if(!(list.contains(arr[count])))
//                    list.add(arr[count]);
//            }
//            count++;
//        }
//        if(list.isEmpty()){
//            list.add(-1);
//        }
//
//        Collections.sort(list);
//        return list;



// // code here
//        int count = 0, repeat;
//        TreeSet<Integer> list = new TreeSet<>();
//
//        while (count < arr.length){
//            repeat = 0;
//            for(int i = 0; i < arr.length; i++){
//                if((arr[count] == arr[i])&&(repeat <= 2)){
//                    repeat++;
//                    if(repeat == 2){
//                        break;
//                    }
//                }
//            }
//            if(repeat == 2){
//                if(!(list.contains(arr[count])))
//                    list.add(arr[count]);
//            }
//            count++;
//        }
//        if(list.isEmpty()){
//            list.add(-1);
//        }
//
//        ArrayList<Integer> arraylist = new ArrayList<>(list);
//        return arraylist;