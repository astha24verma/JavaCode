package Recursion;

public class SkipChar {
    public static void main(String[] args) {
        // Time complexity = length of string
        String str = "baccdad";
        // skip all the 'a'
//        skipCh("", str);                       // method 1
        System.out.println(skipCh(str));         // method 2
        String apple = "abbcappleccb";
        System.out.println(skipString(apple));
        String app = "ccappdccapplebccdd"; // Skip app if it's not apple
        System.out.println(skipStringIfNotRequiredString(app));
    }

    // Method 1
    public static void skipCh(String p, String up) {
        if (up.equals("")) {
            System.out.println(p);
            return;
        }

        if (up.startsWith("a")) {
            skipCh(p, up.substring(1));
        } else {
            skipCh(p + up.charAt(0), up.substring(1));
        }

    }

    // Method 2
    private static String skipCh(String str) {
        if (str.equals("")) {
            return "";
        }
        char ch;
        ch = str.charAt(0);
        if (ch == 'a') {
            return skipCh(str.substring(1));
        } else {
            return ch + skipCh(str.substring(1));
        }
    }

    private static String skipString(String str) {
        if (str.equals("")) {
            return "";
        }

        if (str.startsWith("apple")) {
            return skipString(str.substring(5));
        } else {
            return str.charAt(0) + skipString(str.substring(1));
        }
    }

    private static String skipStringIfNotRequiredString(String str) {
        if (str.equals("")) {
            return "";
        }

        if (str.startsWith("app") && !(str.startsWith("apple"))) {
            return skipStringIfNotRequiredString(str.substring(3));
        } else {
            return str.charAt(0) + skipStringIfNotRequiredString(str.substring(1));
        }
    }

}
