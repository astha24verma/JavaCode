package BasicCode;

public class HeapSort {

    static void insert(int[] A, int n)
    {
        int x = A[n];
        int y = n;
        while(y > 1 && A[y/2] < x )
        {
           A[y] = A[y/2];
           y = y/2;
        }
        A[y] = x;

        for(int i = 0; i <= n; i++)
        {
            System.out.print(A[i] +"  ");
        }
        System.out.println();
    }
    static void delete(int[] A, int n)
    {
        int i, j, val;
     //  int x;
        val = A[1];
      //  x = A[n];
        A[1] = A[n];
        A[n] = val;
        i = 1;
        j = i * 2;
        while (j < n-1)
        {
            if(A[j+1] > A[j])
            {
                j = j + 1;
            }
            if(A[i] < A[j])
            {
               int temp = A[i];
               A[i] = A[j];
               A[j] = temp;
               i = j;
               j = 2 * i;
            }
            else
                break;
        }
        for(i = 0; i <= n; i++)
        {
            System.out.print(A[i] +"  ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [] A = {0, 10, 20, 30, 25, 5, 40, 35};
        int i, n = 7;
        for(i = 2; i <= n; i++)
        {
            insert(A, i);

        }
        for(i = 7; i > 1; i--)
        {
            delete(A, i);
        }
        for(i = 0; i <= n; i++)
        {
            System.out.print(A[i] +"  ");
        }
        System.out.println();
    }
}
