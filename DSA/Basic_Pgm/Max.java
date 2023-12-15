import java.util.Scanner;

/**
 * Max
 */
public class Max {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
// int max=0;
// if (a>c) {
//     max=a;
// } else {
//     max=b;
// }
// if (c>max) {
//     max=c;
// }

int max = Math.max(a,Math.max(c, b));


System.out.println(max);

    }
}