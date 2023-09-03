package BasicCode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int[] tasks = {2, 2, 3, 3, 2, 4, 4, 4, 4, 4};
        int round = 0;
        int count = 1;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < tasks.length; i++) {
            if (i == tasks.length - 1) {
                count++;
                map.put(tasks[i], count);
            }

            if (tasks[i] != 0) {
                for (int j = i + 1; j < tasks.length - 1; j++) {
                    if (tasks[j] != 0 && tasks[i] == tasks[j]) {
                        count++;
                        tasks[j] = 0;
                        map.put(tasks[i], count);
                    } else {
                        System.out.println(count);
                        if (count == 1) {
                            System.out.println("-1");
                            break;
                        }
                        count = 1;
                    }
                }


            }

        }
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            System.out.println(e.getValue());
            int val = e.getValue();
            if (val > 3) {
                if (val % 3 == 0) {
                    round += val / 3;
                } else {
                    round += val / 3 + 1;
                }
            }
            if (val == 3) {
                round++;
            }
            if (val == 2) {
                round++;
            }
            if (val == 1) {
                System.out.println("-1");
                break;
            }

        }


        System.out.println(map);
        System.out.println(round);
    }
}

