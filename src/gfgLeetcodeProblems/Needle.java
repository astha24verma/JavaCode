package gfgLeetcodeProblems;

public class Needle {
    public static void main(String[] args) {
        String haystack = "aassadbusadtsad";
        String needle = "sad";
        int ind = -1;
        int count = 0;
        for(int i = 0; i < haystack.length(); i++){
//            if(haystack.charAt(i) == needle.charAt(0)){
//                count = 0;
//            }
            if(haystack.charAt(i) == needle.charAt(count)){
                if(count == 0){
                    ind = i;
                    System.out.println("HERE - "+ i +" || C = "+count);
                }
                count++;
                System.out.println("NEXT - " + i);
                if(count == needle.length()){
                    System.out.println(ind);
                    break;
                }

            }else{
                System.out.println("OTHER - "+ i);
                count = 0;
            }
        }

        System.out.println(-1);


    }
}
