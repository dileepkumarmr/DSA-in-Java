package Basic_Pgm;

//
//public class practise {
//    public static void main(String[] args) {
//  /*
//        String str = "dileep";
//
//        StringBuffer sb = new StringBuffer(str);
//        sb.reverse();
//        System.out.println(sb);
//*/
////        StringBuffer sb = new StringBuffer();
//
//
//    }
//}
/*
import java.util.HashMap;
import java.util.Map;

public class practise {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        System.out.println(map);

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] nums = {2,11, 15, 7};
        int target = 9;

        int[] result = twoSum(nums, target);

        if (result.length == 2) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No two sum solution found.");
        }
    }
}
*/

public class practise {

//    public static void main(String[] args) {
//
////        int num2[] = {1, 2, 3, 5};
//        String s="Dileep";
//        for (char num: s.toCharArray()) {
//            System.out.print(num);
//        }
//    }

//    public static boolean isSubsequence(String s, String t) {
//        int s1 = s.length(), s2 = t.length();
//        int i = 0, j = 0;
//
//        while (i < s1 && j < s2) {
//            if (s.charAt(i) == t.charAt(j)) {
//                i++;
//            }
//            j++;
//        }
//        return i == s1;
//    }
//
//    public static void main(String[] args) {
//
//        // Example 1
//        String s1 = "abc";
//        String t1 = "ahbgdc";
//        boolean result1 = isSubsequence(s1, t1);
//        System.out.println("Input: s = \"" + s1 + "\", t = \"" + t1 + "\"");
//        System.out.println("Output: " + result1); // Expected output: true
//
//        // Example 2
//        String s2 = "axc";
//        String t2 = "ahbgdc";
//        boolean result2 = isSubsequence(s2, t2);
//        System.out.println("Input: s = \"" + s2 + "\", t = \"" + t2 + "\"");
//        System.out.println("Output: " + result2); // Expected output: false
//    }



        public static double findMaxAverage(int[] nums, int k) {
            // Step 1: Calculate the initial sum of the first k elements
            int sum = 0;
            for (int i = 0; i < k; i++) {
                sum += nums[i];
            }

            // Initialize maxSum as the sum of the first k elements
            int maxSum = sum;

            // Step 2: Slide the window across the array
            for (int i = k; i < nums.length; i++) {
                sum += nums[i] - nums[i - k]; // Slide th
                maxSum = Math.max(maxSum, sum); // Updat
            }

            // Step 3: Calculate and return the maximum average
            return (double) maxSum / k;
        }

        // Main function to test the code
        public static void main(String[] args) {

            // Sample Input 1
            int[] nums1 = {1, 12, -5, -6, 50, 3};
            int k1 = 4;
            System.out.println("Maximum average for nums1: " + findMaxAverage(nums1, k1)); // Expected Output: 12.75

            // Sample Input 2
            int[] nums2 = {5, 1, 3, 7, 8, 2, 4, 6};
            int k2 = 3;
            System.out.println("Maximum average for nums2: " + findMaxAverage(nums2, k2)); // Expected Output: 7.66667

            // Sample Input 3
            int[] nums3 = {4, -1, -2, 10, -4, 3, 2, 1};
            int k3 = 2;
            System.out.println("Maximum average for nums3: " + findMaxAverage(nums3, k3)); // Expected Output: 5.0
        }
    }



