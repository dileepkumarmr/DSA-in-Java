public class EvenDigits {
    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }

        }

        return count;

    }

    static boolean even(int num) {
        int numberOfDigits = digits(num);

        return numberOfDigits % 2 == 0;
    }

    // static int digits(int num) {

    //     if (num < 0) {
    //         num = num * -1;

    //     }
    //     if (num == 0) {
    //         return 1;
    //     }
    //     int count = 0;
    //     while (num > 0) {
    //         num /= 10;
    //         count++;

    //     }
    //     return count;
    // }

     static int digits(int num) {
        return (int) Math.log10(num)+1;
     }

    public static void main(String[] args) {
        int[] nums = { 12, 345, 24, 46, 7896 };
        System.out.println(findNumbers(nums));
        System.out.println(digits(7156));
    }
}
