package BitManipulationMathQuestions;

// Find which number is not appearing thrice( odd times - 5 or 7 ) in array
public class IsOneWhenOtherAreThree {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 2, 8, 8, 8, 3, 3, 5};
//        int[] arr = {2, 2, 2, 2, 2, 4, 4, 4, 4, 4, 6, 7, 7, 7, 7, 7};
        System.out.println(notThrice(arr));
    }

    private static int notThrice(int[] arr) {
        int sum = 0;

        for (int n : arr) {
            String s = Integer.toBinaryString(n);
            int bin = Integer.parseInt(s);
            sum += bin;
        }

        int num = sum;
        int rem = 0, modThree = 0;
        String ans = "";
        while (num != 0) {
            rem = num % 10;
            modThree = rem % 3;
            ans = modThree + ans;
            num = num / 10;
        }
        System.out.println(sum + "  :  " + ans);
        return Integer.parseInt(ans, 2);
    }
}
