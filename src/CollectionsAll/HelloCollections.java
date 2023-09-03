package CollectionsAll;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HelloCollections {

    public static void main(String[] args) {

        System.out.println("This is hash map : ");
        HashMap<Integer, String> myMap = new HashMap<>();
        myMap.put(1, "Rishabh");
        myMap.put(null, null);
        myMap.put(2, "Jia");

        System.out.println(myMap);


        String s = "CONT";
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));

        List<String> list = new ArrayList<>();
        int count = 0;
        String out = "";
        int n = 0;
        int max = 0;
        for (String a : arr) {
            if (max < a.length()) {
                max = a.length();
            }
        }

        while (n < max) {
            out = "";
            for (String a : arr) {
                char ch;
                if (count < a.length()) {
                    ch = a.charAt(count);
                } else {
                    ch = ' ';
                }
                out = out + ch;
            }
            int letter = 0;
            for (int i = 0; i < out.length(); i++) {
                if (out.charAt(i) != ' ') {
                    letter = i;
                    letter++;
                }
            }
            if (letter != 0) {
                out = out.substring(0, letter);
                list.add(out);
            }
            count++;
            n++;
        }

        System.out.println(list);


    }
}
