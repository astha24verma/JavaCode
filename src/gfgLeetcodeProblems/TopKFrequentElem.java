package gfgLeetcodeProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Can optimize :(
public class TopKFrequentElem {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2, 2, 3};
        System.out.println(Arrays.toString(topKFrequent(arr, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        int num = -1; //key
        int n = 0;
        while (n < k) {
            int max = 0;
            for (Map.Entry<Integer, Integer> e : map.entrySet()) {
                if (max < e.getValue()) {
                    max = e.getValue();
                    num = e.getKey();
                }
            }

            map.put(num, 0);

            ans[n] = num;
            n++;
        }

        return ans;
    }
}
