package com.company.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class TryArrayListPositiveNumbersReverseList {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list1= new ArrayList<>();

        while(true){
            int n = sc.nextInt();
            if(n >= 0){
                list1.add(n);
            }else{
                break;
            }
        }

        for(int i = list1.size()-1; i >= 0; i--){
            System.out.print(list1.get(i)+" ");
        }
    }


}
