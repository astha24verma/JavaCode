package Recursion;

public class TowerOfHanoi {
    public static void main(String[] args) {
        int n = 3;
        toh(n, 'A', 'B', 'C');
    }

    private static void toh(int n, char src, char aux, char dest) {
        if (n == 1) {
//            System.out.println("move disk from rod " + src + " to rod " + dest);
            System.out.println("move disk " + n + " from rod " + src + " to rod " + dest);
            return;
        }

        toh(n - 1, src, dest, aux);
//        toh(1, src, aux, dest);
        System.out.println("move disk " + n + " from rod " + src + " to rod " + dest);
        toh(n - 1, aux, src, dest);

    }


}
