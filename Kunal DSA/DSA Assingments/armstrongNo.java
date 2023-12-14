public class armstrongNo {
    
    public static boolean armstrong(int n) {

        int orgNo=n;
        int count=0;
        int temp=n;

        while (temp!=0) {
            count++;
            temp/=10;
        }

        int sum=0;

        while (n!=0) {
            int digit = n%10;
            sum+= Math.pow(digit,count);
            n/=10;
        }

        return (sum == orgNo);
    }
    public static void main(String[] args) {
        boolean ans = armstrong(153);
        System.out.println(ans);


    }
}
