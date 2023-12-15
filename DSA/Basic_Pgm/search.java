public class search {
    public static void main(String[] args) {
        int[] nums = { 91, 25, 5, 1, 6, 9, 18, 91 };
        int target = 91;

        int ans = linearSearch(nums, target, 0,5);

        
        System.out.println(ans);

    }

    static int linearSearch(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index < end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }

        }

        return -1;

    }
}
