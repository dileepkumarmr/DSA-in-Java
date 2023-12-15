import java.util.Scanner;

public class MulNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int num= sc.nextInt();
        int term=sc.nextInt();

        for (int i = 1; i <=term; i++) {
            int res = num*i;
            System.out.println(num+" X "+i+" = "+res);
        }
    }
}
