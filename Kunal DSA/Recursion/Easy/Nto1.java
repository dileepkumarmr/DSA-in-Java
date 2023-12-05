package Recursion.Easy;

public class Nto1 {
    public static void main(String[] args) {
        funRev(5);
        // fun(5);
    }

    public static void fun(int n) {
        if (n == 0) {
            return;
        }
        fun(n - 1);
        System.out.println(n);
    }

    public static void funRev(int n) {
        if (n == 0) {
            return;
        }
        funRev(n - 1);
        System.out.println(n);
    }

    public static void funBoth(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);

        funBoth(n - 1);
        System.out.println(n);
    }
}
