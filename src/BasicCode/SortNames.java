package BasicCode;

import java.util.Scanner;

public class SortNames {
    public static void main(String[] args) {
        int i,j,index;
        String temp, min;
        String names[] = new String[5];
        System.out.println("Enter 5 names : ");
        Scanner sc = new Scanner(System.in);
        for (i =  0; i < names.length; i++){
            names[i] = sc.next();
        }

        for (i = 0; i < names.length-1 ; i ++){
            min = names[i];
            index = i;

            for (j = i ; j < names.length-1 ; j++){
                if (min.compareTo(names[j + 1]) > 0 ){
                    min = names[ j + 1];
                    index = j + 1;
                }
            }
            temp = names[index];
            names[index] = names[i];
            names[i] = temp;
        }
        System.out.println("Alphabetically sorted names : ");
        for (i =  0; i < names.length; i ++){
            System.out.println(names[i]);
        }

    }
}
