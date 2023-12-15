import java.util.Arrays;

/**
 * array
 */
public class Anagram2 {

    public static void main(String[] args) {
        // words
        String str1 = "race";
        String str2 = "care";
        // String length
        if (str1.length() == str2.length()) {
            char[] charStr1 = str1.toCharArray();
            char[] charStr2 = str2.toCharArray();
            Arrays.sort(charStr1);
            Arrays.sort(charStr2);
            boolean result = Arrays.equals(charStr1, charStr2);

            if (result) {
                System.out.println(result);
            } else {
                System.out.println("Not anagram.");
            }

        } else {
            System.out.println("Not anagram.");
        }

    }
}

/*
 * String str1 = "Heart";
 * String strn1 = str1.toLowerCase();
 * 
 * char[] a = strn1.toCharArray();
 * Arrays.sort(a);
 * 
 * System.out.println(a);
 * 
 * int a[] ={1,2,3,58,5};
 * 
 * for (int i = 0; i < a.length; i++) {
 * System.out.println(a[i]);}
 */