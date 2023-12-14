
public class primePrin {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        // Efficient
        for (int i = 2; i * i <= Math.sqrt(n); i++) { // OR (i * i <= n)
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 20;
        for (int i = 1; i < n; i++) {
            System.out.println(i + " " + isPrime(i));
        }
    }
}