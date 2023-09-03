package CollectionsAll;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicateFromArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        list.add(4);
        list.add(7);
        list.add(9);
        list.add(4);
        list.add(3);
        list.add(7);
        list.add(8);
        list.add(7);

        for (int i = 0; i < list.size(); i++) {
            int current = list.get(i);
            if (!(list2.contains(current))) {
                list2.add(current);

            }
        }

        System.out.println(list2);

        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);

    }
}
