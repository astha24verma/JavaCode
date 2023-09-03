package com.company.basicCode;

public class P6OccurrencesOfCharsInString {
    public static void main(String[] args) {
        String str = "Hi how are you..";
        str = str.toLowerCase();
        char[] arr = str.toCharArray();
        int count;
        for (int i = 0; i < arr.length-1; i++) {
            count = 1;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]){
                    count++;
                    arr[j] = ' ';
                }
            }
            if((arr[i] != ' ') && (count > 0)){
                System.out.println( arr[i] +" occurred "+ count +" times");
            }
        }
    }
}
