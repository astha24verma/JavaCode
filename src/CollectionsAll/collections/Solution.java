package com.company.collections;

import java.text.NumberFormat;
import java.util.*;

public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        ArrayList<String> l = new ArrayList<>();


        int n = ((s.length())*(s.length() + 1))/2; //no. of all the substrings
        int temp = 0;
        int t= 0;
        String[] sub = new String[n];
        String[] sub3 = new String[n];

        for(int i = 0 ; i < s.length(); i++){
            for(int j = i ; j < s.length(); j++){
                sub[temp] = s.substring(i,j+1);
                temp++;
            }
            if(sub[i].length() == 3){
                l.add(sub[i]);

            }
        }
        int min = 0;
        int max = l.size()-1;
        smallest = l.get(min);
        largest = l.get(max);
        for(int p = 0; p < l.size(); p ++){
            if((smallest.compareTo(l.get(p))) < 0){
                smallest = l.get(p);
            }
            if((largest.compareTo(l.get(p))) > 0){
                largest = l.get(p);
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
    }

