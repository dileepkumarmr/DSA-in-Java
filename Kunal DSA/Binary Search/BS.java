import java.util.Arrays;

public class BS {

    public static void main(String[] args) {
        int [] nums={4,5,6,7,0,1,2};
        int target =0;
        System.out.println(searchB(nums,target));
    }

    public static int searchB(int[] nums, int target) {

        // Arrays.sort(nums);

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                return mid;
            }

            if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
    

}
