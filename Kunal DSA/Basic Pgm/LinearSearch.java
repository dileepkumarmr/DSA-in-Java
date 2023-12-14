
public class hello {
    public static void main(String[] args) {
        int[] nums = { 1, 25, 5, 1, 6, 91, 18 };
        int target = 91;

        int ans = linearSearch(nums, target);
       System.out.println(ans);
       

    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }

        }

        return target;

    }

}