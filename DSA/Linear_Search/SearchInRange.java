public class SearchInRange {

    public static int linearSearch(int[] arr, int target, int start, int end) {

        if (arr.length == 0) {
            return -1;
        }

        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
                int[] arr = { 12, 24, 56, 48, 69, 73, 84, 85 };
        int ans = linearSearch(arr, 73,2,5);
        System.out.println(ans);

        
    }
}
