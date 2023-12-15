package Recursion.Easy;

public class DigitProduct {
    public static void main(String[] args) {
        int ans = 505;
        System.out.println(product(ans));
    }

    public static int product(int n) {
        if (n % 10 == n) {
            return n;
        }

        return n % 10 * product(n / 10);
    }
}
