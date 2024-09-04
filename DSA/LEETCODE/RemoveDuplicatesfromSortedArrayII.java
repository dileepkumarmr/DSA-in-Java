package LEETCODE;

public class RemoveDuplicatesfromSortedArrayII {


    public static int removeDuplicates(int[] nums) {
//        int j = 1;
//        for (int i = 1; i < nums.length; i++) {
//            if (j == 1 || nums[i] != nums[j - 2]) {
//                nums[j++] = nums[i];
//            }
//        }
//        return j;

        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i - 2])
                nums[i++] = n;
        return i;
    }

    public static void main(String[] args) {


        // Example 1
        int[] nums1 = {1, 1, 1, 2, 2, 3};
        int k1 = removeDuplicates(nums1);
        System.out.println("Output: " + k1);
        System.out.print("Updated nums: ");
        for (int i = 0; i < k1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println("\n");

        // Example 2
        int[] nums2 = {0, 0, 1, 1, 1, 1, 2, 3, 3};
        int k2 = removeDuplicates(nums2);
        System.out.println("Output: " + k2);
        System.out.print("Updated nums: ");
        for (int i = 0; i < k2; i++) {
            System.out.print(nums2[i] + " ");
        }
        System.out.println();
    }


}
