/**
 * Palinndr
 */
public class Palinndr {

    public static void main(String[] args) {

        String str = "level";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {

        if (str == null || str.length() == 0) {
            return true;
        }

        for (int i = 0; i <= str.length() / 2; i++) {
            str = str.toLowerCase();
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                return false;
            }
        }

        return true;
    }

}