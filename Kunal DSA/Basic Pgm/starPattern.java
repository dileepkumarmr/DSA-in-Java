import java.util.Scanner;

/**
 * starPattern
 */
public class starPattern {


        public static void nStarTriangle(int N) {
            // Write your code here
    
            for(int i=0;i<N;i++) {
    
                for(int j=0;j<N-i-1;j++) {
                    System.out.print(" ");
                }
    
                for(int j=0;j<2*i+1;j++) {
                    System.out.print("*");
                }
    
                for(int j=0;j<N-i-1;j++) {
                    System.out.print(" ");
                }
                System.out.println();
    
            }
        }
    
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // int N = 4
        // // sc.nextInt()
        // ;
        
        // for (int i = 0; i < N; i++) {
            
        //     for (int j = N; j >i; j--) {
        //         System.out.print(N-j+1+" ");
        //     }
        //     System.out.println();
        // }

        nStarTriangle(5);
    }
}