package gfgLeetcodeProblems;

import java.util.ArrayList;
import java.util.Scanner;

class Solution {
    public ArrayList<Integer> FindIndices(String a, String b) {
        //Write your code here
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < a.length() ; i++) {
            if(a.charAt(i) == b.charAt(0)){
                boolean check = true;
                for (int j = 1; j < b.length(); j++) {
                    if(a.charAt(i+j) != b.charAt(j)){
                        check = false;
                        break;
                    }
                }
                if(check){
                    ans.add(i+1);
                }
            }
        }

        if (ans.size() == 0){
            ans.add(-1);
        }

        return ans;


//        int st = 0;
//        boolean c1 = false;
//        int end = b.length() - 1;
//        for(int i = 0 ; i < a.length() ; i++ ){
//            if(a.charAt(i) == b.charAt(st)){
//                ans.add(i+1);
//                c1 = true;
//            }
//        }
//        if(!c1) System.out.println(-1);
//        return ans;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        Solution Obj = new Solution();
        ArrayList<Integer> ans = Obj.FindIndices(a, b);
        for(int x : ans)
            System.out.print(x + " ");
    }
}

/*class Solution {
        public void creatinglist(ArrayList<Integer> a , int sp , int ep){
            for(int i = sp ; i <= ep ; i++ ){
                a.add(i);
            }
        }
        public boolean RangeCheck(int[][] intervals, int a, int b) {
            // Write your code here
            int n = b - a + 1;
            int[] range = new int[n];
            int idx = 0;
            for(int i = a ; i <= b ; i++){
                range[idx] = i;
                idx++;
            }
            ArrayList<Integer> list = new ArrayList<>();

            for(int i = 0 ; i < intervals.length ; i++ ){
                int sp = intervals[i][0];
                int ep = intervals[i][1];
                creatinglist(list , sp , ep);
            }
            int count = 0;
            for(int i = 0 ; i < range.length ; i++){
                for(int j = 0 ; j < list.size() ; j++){
                    if(range[i] == list.get(j)) count++;
                }
            }
            if(count == range.length) return true;
            else
                return false;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            int[][] intervals = new int[n][2];
            for(int i = 0; i < n; i++) {
                intervals[i][0] = sc.nextInt();
                intervals[i][1] = sc.nextInt();
            }
            int a = sc.nextInt();
            int b = sc.nextInt();
            Solution Obj = new Solution();
            if(Obj.RangeCheck(intervals, a, b))
                System.out.println("true");
            else
                System.out.println("false");
        }
}*/
