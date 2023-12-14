import java.util.Scanner;

/**
 * fibo
 */
public class fibo {

    public static int fibb(int n) {
        int first = 0;
        int second = 1;
        

        if(n < 2) {
            return -1;
        }

        for(int i = 2;i <= n;++i) {
            int temp = first + second;
            second = first;
            first = temp;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(fibb(2));
    }

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);

     
    //     int first = 0;
    //     int second = 1;
    //     int count = 10; //count = sc.nextInt();

    //     for (int i = 0; i <=count; ++i) {
    //         System.out.print(first + " ");
    //         int temp = first+second;
    //         first = second;
    //        second  = temp;
    //     }
    // }
}