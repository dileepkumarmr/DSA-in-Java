import java.util.*;

public class Sol {

    public static void main(String[] args) {
        // System.out.println(Integer.MAX_VALUE);

        Scanner sc = new Scanner(System.in);

        int n = 132456
        // sc.nextInt()
        ;

        int evenNum = 0;
        int oddNum = 0;

        while (n > 0) {
            int rem = n % 10;
            // System.out.print(rem);
            if (n % 2 == 0) {
                evenNum = evenNum + rem;

            } else {
                oddNum = oddNum + rem;
            }

            n /= 10;
        }
        System.out.println(evenNum + " " + oddNum);
    }
}