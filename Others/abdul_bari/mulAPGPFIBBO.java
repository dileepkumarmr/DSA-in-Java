import java.util.Scanner;;

public class mulAPGPFIBBO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Fibonacci series.");

        System.out.println("Enter the no: ");
        int n = sc.nextInt();
        int a=0,b=1,c;

        System.out.print(a +","+b +",");

        for(int i=0;i<n-2;i++)
        {
            c= a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }










        // int a = sc.nextInt();
        // int r = sc.nextInt();
        //  int n = sc.nextInt();

        //  int term = a;

        //  for(int i=0;i<n;i++) {
        //     System.out.print(term+",");
        //     term*=r;
        //  }
        // for(int i=1 ; i<=10; i++){
        // System.out.println(n+"X" + i +"=" + n*i);
        // }
        // int sum =1;
        // for(int i =1; i<=n; i++) {
        // sum = sum *i;
        // }
        // System.out.println(sum);
        // int count=0;
        // while(n>0){
        // n=n/10;
        // count++;

        // int rev = 0, r;

        // while (n > 0) {
        //     r = n % 10;
        //     rev = rev * 10 + r;
        //     n /= 10;



        // }
        // System.out.println(rev);


        
    }

}
