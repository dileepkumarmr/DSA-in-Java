package Basic_Pgm;

public class Solution {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Index of the last element in nums1 (considering m elements)
        int j = n - 1; // Index of the last element in nums2
        int k = m + n - 1; // Index of the last position in nums1 (considering total length)

        // Merge the arrays starting from the end
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--]; // Copy the larger element to the end of nums1
            } else {
                nums1[k--] = nums2[j--]; // Copy the element from nums2 to nums1
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {1, 2, 3, 0, 0, 0}; // Array nums1 with extra space at the end
        int m = 3; // Number of elements in nums1 to consider
        int[] nums2 = {2, 5, 6}; // Array nums2
        int n = 3; // Number of elements in nums2 to consider

        solution.merge(nums1, m, nums2, n);
        System.out.print("Merged Array: ");
        for (int num : nums1) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

