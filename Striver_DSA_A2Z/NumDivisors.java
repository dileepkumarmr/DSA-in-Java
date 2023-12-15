
public class NumDivisors {

    public static void printDivisors(int n) {

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
            if (i != n / i) {
                System.out.print(n / i + " ");
            }
        }
        System.out.println();

    }

    public static void main(String[] args) {
        printDivisors(36);
    }
}