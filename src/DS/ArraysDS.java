package DS;

// Inserting an element in an Array
class ArrayInsertOneElement {

    public static void insert(char[] ar, int pos, char val){
        //Traversing the array from the last position to the position where the element has to be inserted
        for(int i=ar.length-1;i>=pos;i--){
            //Moving each element one position to its right
            ar[i]=ar[i-1];
        }

        //Inserting the data at the specified position
        ar[pos-1]=val;
    }
}


class ArrayDeleteOneElement {

    public static void delete(char[] ar, int pos){
        //Traversing the array from the position where the element has to be deleted to the end
        for(int i=pos-1;i<ar.length-1;i++){
            //Moving each element one position to the left
            ar[i]=ar[i+1];
        }

        //The space that is left at the end is filled with character '0'
        ar[ar.length-1]='0';
    }
}

public class ArraysDS {
    public static void main(String[] args) {

        char arr[]=new char[6];
        arr[0]='A';
        arr[1]='B';
        arr[2]='C';
        arr[3]='D';
        arr[4]='E';

        // Initial Array
        System.out.println(" Initial Array : ");
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + ", ");

        System.out.println();

        //Make changes and try to insert elements at different positions
        ArrayInsertOneElement.insert(arr, 3, 'J');
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + ", ");

        System.out.println();

        //Make changes and try to delete elements from different positions
        ArrayDeleteOneElement.delete(arr, 3);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + ", ");
    }

}
