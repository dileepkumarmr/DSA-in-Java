package Basic_Pgm;

import java.util.Scanner;

public class armstrongSumRange {
    public static boolean armstrongSumRange(int num) {
        if(num==1) {
            return true;
        }

        int orgNum = num;
        int noOfDigits = 0;
        int temp = num;

        while (temp != 0) {
            noOfDigits++;
            temp /= 10;
        }

        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, noOfDigits);
            num /= 10;
        }

        return (sum == orgNum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int lower=sc.nextInt();
        int upper=sc.nextInt();

        System.out.println("ip");
        int sum=0;

        for (int i = lower; i < upper; i++) {
            if (armstrongSumRange(i)) {
                sum+=i;
            }
        }
        System.out.println(sum);

//        boolean ans = armstrongSumRange(153);
//        System.out.println(ans);
    }
}
