public class countNum {
    public static void main(String[] args) {
        int n = 4555684;

        int count = 0;

        while (n>0) {
            int rem = n%10;
            if(rem==4) {
                count++;
            }
            n/=10;
        }
        System.out.println(count);
    }
}
