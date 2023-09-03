package BasicCode;

import java.util.Scanner;

public class MonthNumber {
    public static void main(String[] args) {
        int num;
        String month = "none";
        boolean flag = true;
        System.out.print("Enter Month Number : ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        switch(num){
            case 1: month = "Jan";
                break;
            case 2: month = "Feb";
                break;
            case 3: month = "Mar";
                break;
            case 4: month = "April";
                break;
            case 5: month = "May";
                break;
            case 6: month = "June";
                break;
            case 7: month = "July";
                break;
            case 8: month = "Aug";
                break;
            case 9: month = "Sep";
                break;
            case 10: month = "Oct";
                break;
            case 11: month = "Nov";
                break;
            case 12: month = "Dec";
                break;
            default:
                System.out.println("Hey! That's not a valid month");
                flag = false;
        }
        if(flag){
            System.out.println("Name of Month : "+ month);
        }
    }
}
