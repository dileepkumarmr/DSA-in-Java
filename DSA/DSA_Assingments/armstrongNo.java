package DSA_Assingments;

public class armstrongNo {

    public static boolean armstrong(int num) {

        int orgNum = num;
//        int numberOfDigits = 0;
        int numberOfDigits = String.valueOf(num).length();
//        int temp = num;



//        while (temp != 0) {
//            numberOfDigits++;
//            temp /= 10;
//        }

        int sum = 0;

        while (num != 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        return (sum == orgNum);
    }

    public static void main(String[] args) {
        boolean ans = armstrong(153);
        System.out.println(ans);
    }
}
