import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String w = sc.next();
        StringBuilder s1 = new StringBuilder(w);

        s1.reverse();
        System.out.println(s1);
}
}
