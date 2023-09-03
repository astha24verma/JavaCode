package BasicCode;

import java.util.Scanner;

public class DiagonalSumMatrix {
    public static void main(String[] args) {
        int m[][] = new int[3][3];
        System.out.println("Enter elements of 3 x 3 matrix");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix is : ");
        for (int i =0 ; i < 3 ; i++)
        {
            for (int j = 0 ; j<3; j++)
            {
                System.out.print(m[i][j] +"\t");
            }
            System.out.println();
        }

        int sum1 = 0;
        int sum2 = 0;
        for (int i =0 ; i < 3 ; i++)
        {
            for (int j = 0 ; j<3; j++)
            {
                if( i == j ){
                    sum1 += m[i][j];
                }
                if( (i+j) == 2){
                    sum2 += m[i][j];
                }
            }
        }
        System.out.print("First Diagonal sum is : ");
        System.out.println(sum1);
        System.out.print("Second Diagonal sum is : ");
        System.out.println(sum2);
    }
}

