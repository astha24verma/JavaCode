package gfgLeetcodeProblems;

import java.util.Arrays;

// optimize it dude   --- USE STACK    Next Greater Element

/*Example 1:

        Input:
        n = 4, arr[] = [1 3 2 4]
        Output:
        3 4 4 -1
        Explanation:
        In the array, the next larger element
        to 1 is 3, 3 is 4, 2 is 4 and for 4?
        since it doesn't exist, it is -1.

        Example 2:

        Input:
        n = 5, arr[] = [6 8 0 1 3]
        Output:
        8 -1 1 3 -1
        Explanation:
        In the array, the next larger element to
        6 is 8, for 8 there is no larger elements
        hence it is -1, for 0 it is 1, for 1 it
        is 3 and then for 3 there is no larger
        element on right and hence -1.
*/
public class Day1NextGreaterElement {

            public static void main(String[] args) {
                System.out.println(Arrays.toString(nextLargerElement(new long[]{1, 3, 2, 4}, 4)));
            }

            public static long[] nextLargerElement(long[] arr, int n) {
                long[] out = new long[arr.length];
                int index = 0;

                for(int i = 0; i < arr.length; i++){
                    int count = i + 1;
                    int check = 0;

                    if(i == arr.length-1){
                        out[index] = -1;
                        break;
                    }

                    do{
                        if(arr[count] > arr[i]){
                            out[index] = arr[count];
                            check = 1;
                            break;
                        }
                        count++;
                    }while(count < arr.length);

                    if(check == 0){
                        out[index] = -1;
                    }


                    index++;

                }
                return out;

            }
        }

