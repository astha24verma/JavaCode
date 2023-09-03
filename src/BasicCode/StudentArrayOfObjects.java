package BasicCode;
import java.util.Scanner;

class Student {
    int rno;
    String name;
    int marks1, marks2, marks3, sum = 0;
    float avg = 0.0f;
    void setValues(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll no. : ");
        rno = sc.nextInt();
        System.out.print("Enter Student Name : ");
        name = sc.next();
        System.out.println("Enter Marks of 3 subjects ( Out of 100 each ) : ");
        marks1 = sc.nextInt();
        marks2 = sc.nextInt();
        marks3 = sc.nextInt();
        sum = marks1 + marks2 + marks3;
        avg = sum/ 3.0f;
    }
    void displayResult(){
        System.out.println("Roll No : "+ rno );
        System.out.println("Name : "+ name );
        System.out.println("Result Percent : "+ avg );
        System.out.println("----------------------------");
    }
}

public class StudentArrayOfObjects {
    public static void main(String[] args) {
        Student[] st = new Student[4];   // or Student st[] = new Student[4]; --> creating array of object of 4 student
        for ( int i = 0; i < 4 ; i++){
            System.out.println("Enter Details for Student "+ (i+1));
            st[i] = new Student();  // --> creating object
            st[i].setValues();
        }
        for ( int i = 0; i < 4 ; i++){
            System.out.println("Result of Student "+(i+1));
            st[i].displayResult();
        }
    }
}
