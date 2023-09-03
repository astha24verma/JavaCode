package gfgLeetcodeProblems;

public class BinarySearchInRotateSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,1};
        int target = 1;
        System.out.println(binarySearchRotated(arr, target));

    }

    private static int binarySearchRotated(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        while(s <= e){
            int mid = (e + s)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[s] <= nums[mid]){
                if(target >= nums[s] && target < nums[mid]){
                    e = mid - 1;
                }else{
                    s = mid + 1;
                }
            }else{
                if(target > nums[mid] && target <= nums[e]){
                    s = mid + 1;
                }else{
                    e = mid - 1;
                }
            }
        }
        return -1;
    }
}
