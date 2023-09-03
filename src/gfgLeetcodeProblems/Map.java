package gfgLeetcodeProblems;

import java.util.HashMap;

public class Map {
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(majorityElement(arr));
    }

    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                System.out.println(num);
                map.put(num, map.get(num)+1);
            }else{
                System.out.println(num);
                map.put(num, 1);
            }
        }

        for(int key : map.keySet()){
            System.out.println("K - "+ key + " :: V - "+ map.get(key));
            System.out.println(nums.length/2 + " !! "+ map.get(key));
            if(map.get(key) > nums.length/2){
                return key;
            }
        }
        return 0;
    }
}
