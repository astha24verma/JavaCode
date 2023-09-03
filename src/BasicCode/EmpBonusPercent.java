package BasicCode;
import java.util.Scanner;
public class EmpBonusPercent {
    public static void main(String[] args) {
        int code, bonus = 0;
        boolean flag = true;
        System.out.print("Enter Employee Code( b/w 100 to 400 ): ");
        Scanner sc = new Scanner(System.in);
        code = sc.nextInt();
        switch(code){
            case 100: bonus = 5;
                break;
            case 200: bonus = 1;
                break;
            case 300: bonus = 2;
                break;
            case 400: bonus = 25;
                break;
            default:
                System.out.println("Wrong Input !");
                flag = false;
        }
        if(flag){
            System.out.println("Your Bonus percent is "+ bonus +"%");
        }



    }
}
