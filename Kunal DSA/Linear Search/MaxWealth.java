public class MaxWealth {

    static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE; //accounts[0][0]

        for (int persons = 0; persons < accounts.length; persons++) {
            int sum = 0;
            for (int account = 0; account < accounts[persons].length; account++) {
                sum += accounts[persons][account];
                ans =Math.max(ans, sum);
            }
            // if (sum > ans) {
            //     ans = sum;
            // }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] accounts = { { 1, 2, 3 }, { 3, 27, 1 } };
        System.out.println(maximumWealth(accounts));
    }
}
