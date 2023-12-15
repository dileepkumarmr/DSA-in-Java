public class Searchingin2DArray {
    public static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int []{row,col};
                    
                }
            }
        }

        return new int[]{-1,-1};

    }


    public static int Max(int[][] arr) {
        int max = Integer.MIN_VALUE; //arr[0][0]
        for (int row = 1; row < arr.length; row++) {
            for (int col = 1; col < arr[row].length; col++) {
                if (arr[row][col] > max ) {
                    max = arr[row][col];
                    
                    
                }
            }
        }

        return max;

    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4, 5 },
                { 11, 22, 33, 77 },
                { 23, 56, 89 },
        };
        // int target = 1;

        // int[] ans = search(arr, target);
        // System.out.println(Arrays.toString(ans));

        System.out.println(Max(arr));
    }
}
