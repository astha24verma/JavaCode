package gfgLeetcodeProblems;
import java.lang.*;
import java.util.ArrayList;

class D3 {
    public static void main(String args[]) {
        System.out.println(carpetBox(12, 82, 84, 5));

    }

    static int carpetBox(int A, int B, int C, int D) {
        //code here
        if (A * B <= C* D) {
            return 0;
        }

        int move = 0;

        while (A * B >= C * D) {

            if ((int) (A / 2) * B <= C * D) {
                move++;
                A = (int) (A / 2);
            } else if ((int) (B / 2) * A <= C * D) {
                move++;
                B = (int) (B / 2);
            } else if (A >= B) {
                A = (int) (A / 2);
                move++;
            } else {
                B = (int) (B / 2);
                move++;
            }

        }
        return move;
    }



}

