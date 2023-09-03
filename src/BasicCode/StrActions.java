package BasicCode;

import java.util.Locale;
import java.util.Scanner;
// Practice Code INFO
public class StrActions {

    public static String strMethod(String inStr, int inInt){
        int n = inInt, r, s, sum = 0;
        String outStr;
        String lower_inStr = inStr.toLowerCase();
        while(n!=0)
        {
            r = n % 10;
            sum = sum + r;
            n = n / 10;
          // s = s * 10 + r;
        }
        int last_dig;
        last_dig = inInt % 10;
        
        //char [] arrChar = inStr.toCharArray();

        if(inStr.length()<4){
            outStr = "A";
        }

        else if(inStr.contains(""+ sum)){
            outStr = "B";
        }

        else if(inStr.length() > last_dig && Character.isDigit(inStr.charAt(inStr.length()-1))){
            outStr = "C";
        }

        else if(lower_inStr.charAt(0) != 'a' || lower_inStr.charAt(0) != 'e' || lower_inStr.charAt(0) != 'i' || lower_inStr.charAt(0) != 'o' || lower_inStr.charAt(0) != 'u'){
            outStr = "D";
        }

        else if(sum > 20){
            outStr = "E";
        }

        else if(lower_inStr.contains("apple") || lower_inStr.contains("oneplus")){
            outStr = "F";
        }

        else{
            outStr = "X";
        }

        return outStr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;
        do {
            System.out.print("Enter String : ");
            String str = sc.next();
            System.out.print("Enter Integer : ");
            int no = sc.nextInt();

            String out = strMethod(str, no);
            System.out.println("Out String : " + out);
            System.out.print("Wanna Continue (y / n) : ");
            choice = sc.next().charAt(0);

        } while (choice=='y');

    }


}
