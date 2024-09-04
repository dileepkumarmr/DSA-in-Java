package LEETCODE;

public class SearchInsertPosition {

    public static void main(String[] args) {
        // Create test cases
        int[] nums1 = {1, 3, 5, 6};
        int target1 = 5;

        int[] nums2 = {1, 3, 5, 6};
        int target2 = 2;

        int[] nums3 = {1, 3, 5, 6};
        int target3 = 7;

        int[] nums4 = {1, 3, 5, 6};
        int target4 = 0;

        // Test the searchInsert function
        System.out.println("Index of target " + target1 + " in array is: " + searchInsert(nums1, target1)); // Output: 2
        System.out.println("Index of target " + target2 + " in array is: " + searchInsert(nums2, target2)); // Output: 1
        System.out.println("Index of target " + target3 + " in array is: " + searchInsert(nums3, target3)); // Output: 4
        System.out.println("Index of target " + target4 + " in array is: " + searchInsert(nums4, target4)); // Output: 0
    }
    public static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end -  start)/2;
            if(nums[mid] == target) {
                return mid;
            } else if(nums[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

}
