package BasicCode;


public class HelloWorld {

    public static void main(String[] args) {

//        System.out.println("Hello World");
//
//        String str1 = "Hello";
//        String str2 = "Hello";
//        if(str1 == str2){
//            System.out.println("Equal");
//        }
//
//        String s1 = "I am23 very happy7 to see you here";
//        s1 = s1.replaceAll("\\s","");
//        s1 = s1.replaceAll("[0-9]","");
//        System.out.println(s1);

        String str = "Hey there how was your day? See you there soon.";
        String arr[] = str.split(" ");

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            String current = arr[i];
            for (int j = 1; j < arr.length - 1; j++) {
                if (current == arr[j]) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(current + " : " + count);
            }
            System.out.println(current);
        }




    }
}