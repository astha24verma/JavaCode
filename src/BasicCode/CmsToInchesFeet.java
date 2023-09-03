package BasicCode;

import java.util.Scanner;

public class CmsToInchesFeet {
    public static void main(String[] args) {

        System.out.print("Enter height in cms : ");
        Scanner sc = new Scanner(System.in);
        float c = sc.nextFloat();
        float i = (float) (c / 2.54); //inches   --> 1 inch = 2.54 cms
        double f = (float)(i / 12.0);  //feet    --> 1 feet = 12 inches   [ & --> 1 feet = 30.48 cms = 12 x 2.54 ]
        System.out.println("Height in inches : " + i);
        System.out.println("Height in feet : " + f);
    }
}
