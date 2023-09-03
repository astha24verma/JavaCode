package BasicCode;

public class Testing {
    public static void main(String[] args) {
        int a = 45;
        boolean b = true;
        System.out.println("Number is " + a + " Boolean value is " + b );
        int x = 24;
        int y = 0;
        try{
            int z = x/y;
        }
        catch (Exception e){
            System.out.println("Error : " + e.getMessage());
        }


    }
}
