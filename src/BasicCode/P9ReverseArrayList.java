package com.company.basicCode;

import java.util.ArrayList;
import java.util.Arrays;

//Write a program to reverse the Array List Elements.
public class P9ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("how");
        list.add("are");
        list.add("you");
        System.out.println(list);

        reverseArrayList(list);
        System.out.print("Reversed ArrayList : "+ list);

    }

    public static void reverseArrayList(ArrayList<String> list) {
        int start = 0, end = list.size()-1;
        while(start < end){
            String temp, str1 = list.get(start), str2= list.get(end);
            temp = str1;
            str1 = str2;
            str2 = temp;

            list.set(start, str1);
            list.set(end, str2);

            start++;
            end--;
        }
    }



}
