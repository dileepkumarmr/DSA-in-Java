package Basic_Pgm;

/**
 * MaxWealth
 */
public class MaxWealth {

    public static void main(String[] args) {
        
    }

    public int maximumWealth(int[][] accounts) {
        // person = row
        // account = col
        int ans = Integer.MIN_VALUE;
        for (int person = 0; person < accounts.length; person++) {
            // when you start new col, take a new sum for that
            int sum=0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }

            if (sum > ans) {
                ans = sum;
            }

        }

        return ans;
        
    }

}