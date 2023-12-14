public class FIndMIn {
    
    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(ans > arr[i]) {
                ans = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { -256,12, 24, 56, 48, 69, 73, 84, 85,-1,-6,-12 };
        
        System.out.println(min(arr));

    }
}
