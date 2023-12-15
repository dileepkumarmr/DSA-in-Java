package Recursion.Strings;

public class SubstringGPT {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println("Substrings of \"" + str + "\":");
        printSubstrings(str, 0);
    }

    static void printSubstrings(String str, int start) {
        int length = str.length();

        // Base case: when the start index reaches the end of the string
        if (start == length) {
            return;
        }

        // Recursive case: print substrings starting from the current index
        for (int end = start + 1; end <= length; end++) {
            System.out.println(str.substring(start, end));
        }

        // Move to the next character and make a recursive call
        printSubstrings(str, start + 1);
    }
}
