package BitManipulationMathQuestions;

public class GetBit {
    // Find the i-th bit (from right)
    // n = 10 -> bin = (1 0 1 0)
    //                  4 3 2 1     <-  i-th position
    public static void main(String[] args) {
        int n = 10;
        int i = 2;
        System.out.println(getBit(n, i));
    }

    private static int getBit(int n, int i) {
//        int mask = (1 << (i - 1)); // (1 0)                       //   1 0 1 0
//        return (n & mask) >> (i - 1);                             // &     1 0
//                                                                     0 0 1 0
//        OR
        return ((n & (1 << (i - 1))) >> (i - 1));
    }
}
