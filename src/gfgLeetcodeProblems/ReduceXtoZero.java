package gfgLeetcodeProblems;

public class ReduceXtoZero {
    public static void main(String[] args) {
        System.out.println(minOperations(new int[]{3,2,20,1,1,3}, 10));
    }
    public static int minOperations(int[] nums, int x) {
        int s = 0;
        int e = nums.length - 1;
        int count = 0;
        while(s <= e && x > 0){
            if( ((x - nums[s]) < 0) && ((x - nums[e]) < 0)){
                if(count == 0){
                    return -1;
                }else{
                    return count;
                }
            }
            if(x - nums[s] <= x - nums[e]){
                x = x - nums[s];
                count++;
                s++;
            }else{
                x = x - nums[e];
                count++;
                e--;
            }
            // s++;
            // e--;
        }
        return count;
//        int count = 0;
//        while(s <= e && x > 0){
//            if( ((x - nums[s]) < 0) && ((x - nums[e]) < 0)){
//                System.out.println(count);
//                if(count == 0){
//                    return -1;
//                }else{
//                    return count;
//                }
//            }
//            if(x - nums[s] >= x - nums[e]){
//                x = x - nums[s];
//                count++;
//                s++;
//                System.out.println(count+ "start");
//            }else{
//                x = x - nums[e];
//                count++;
//                e--;
//                System.out.println(count +"end");
//            }
//            // s++;
//            // e--;
//        }
//        return count;
    }
}
