package Recursion.Strings;

public class Stream {
    public static void main(String[] args) {
         skip("", "baccdah");
//         System.out.println(skip("baccdah"));
//         System.out.println(skipApple("bacapplecdah"));
//        System.out.println(skipAppNotApple("bacapplecdah"));
    }

    public static void skip(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        if (ch == 'c') {
            skip(p, up.substring(1));
        } else {
            skip(p + ch, up.substring(1));
        }
    }

    public static String skip(String up) {
        if (up.isEmpty()) {
            return "";
        }

        char ch = up.charAt(0);

        if (ch == 'a') {
            return skip(up.substring(1));
        } else {
            return ch + skip(up.substring(1));
        }
    }

    public static String skipApple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    public static String skipAppNotApple(String up) {
        if (up.isEmpty()) {
            return "";
        }

        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipAppNotApple(up.substring(5));
        } else {
            return up.charAt(0) + skipAppNotApple(up.substring(1));
        }
    }
}
