public class BinarSearchSQRT {

    public static void main(String[] args) {
        int num = 40;
        int precision = 3;
        System.out.println(sqrt(num, precision));

    }

    public static double sqrt(int num, int precision) {
        int start = 0;
        int end = num;

        double root = 0.0;

        // Simple binary search
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid * mid == num) {
                return mid;
            }

            if (mid * mid > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // root = end;
        double incr = 0.1;

        for (int i = 0; i < precision; i++) {
            while (root * root <= num) { 
                root += incr;
            }
            root -= incr;
            incr /= 10;  //0.01, 0.001 ..... & more precisions 
        }
        return root;
    }
}