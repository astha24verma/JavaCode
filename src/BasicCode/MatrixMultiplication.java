package BasicCode;

import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        int A[][] = new int[3][3];
        int B[][] = new int[3][3];
        int C[][] = new int[3][3];
        System.out.println("Enter elements of first 3 x 3 matrix");
        Scanner sc = new Scanner(System.in);
        for (int i =0 ; i < 3 ; i++)
        {
            for (int j = 0 ; j<3; j++)
            {
              A[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of second 3 x 3 matrix");
        for (int i =0 ; i < 3 ; i++)
        {
            for (int j = 0 ; j<3; j++)
            {
                B[i][j] = sc.nextInt();
            }
        }
        System.out.println("Multiplication of matrices is : ");
        for (int i =0 ; i < 3 ; i++)
        {
            for (int j = 0 ; j<3; j++)
            {
                C[i][j]=0;
                for (int k = 0 ; k<3 ; k++)
                {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        System.out.println("Matrix A :");
        for (int i =0 ; i < 3 ; i++)
        {
            for (int j = 0 ; j<3; j++)
            {
                System.out.print(A[i][j] +"\t");
            }
            System.out.println();
        }
        System.out.println("Matrix B :");
        for (int i =0 ; i < 3 ; i++)
        {
            for (int j = 0 ; j<3; j++)
            {
                System.out.print(B[i][j] +"\t");
            }
            System.out.println();
        }
        System.out.println("Multiplication of matrices : ");
        for (int i =0 ; i < 3 ; i++)
        {
            for (int j = 0 ; j<3; j++)
            {
                System.out.print(C[i][j] +"\t");
            }
            System.out.println();
        }


    }
}
