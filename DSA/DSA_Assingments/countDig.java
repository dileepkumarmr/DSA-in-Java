public class countDig {
    public static void main(String[] args) {
        int n =373;
        int count=0,num=n;

        while (num>0) {
        int temp=num%10;
        if (temp>0 && n%temp==0) {
            count++;
        }   
        num/=10;
        }

        System.out.println(count);
    }
}
