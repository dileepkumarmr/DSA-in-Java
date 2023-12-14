
public class main {
    public static void main(String[] args) {
        int[] nums = { 1, 25, 5, 1, 6, 9, 18, 91 };
        int target = 91;

        // int ans = linearSearch(nums, target);
        
        boolean ans = linearSearch2(nums, target);
        System.out.println(ans);

    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return element;
            }

        }

        return -1;

    }

    static boolean linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return true;
            }

        }

        return false;

    }
}