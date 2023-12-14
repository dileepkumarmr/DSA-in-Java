import java.util.*;

public class array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int A[] = new int[10];
        // int A[] = { 3, 5, 6, 9, 10, 11, 13, 15, 16, 18, 19, 22, 25 };
        // int B[] = { 1, 2, 256, 4, 5,25,200};
        // int C[];
        // C = new int[10];

        // // B[2] = 15;
        // for (int i = 0; i < B.length; i++) {

        // System.out.print(B[i]++);
        // }

        // int sum = 0;
        // for (int i : B) {
        // sum = sum + i;
        // }
        // System.out.println(sum);

        // int sum = 0;
        // for(int i =0;i<B.length;i++) {
        // sum = sum + B[i];
        // }
        // System.out.println(sum);

        // int key = 0;
        // key = sc.nextInt();
        // for (int i = 0; i < B.length; i++) {
        // if (B[i] == key) {
        // System.out.println(i);
        // System.exit(0);
        // }

        // }
        // System.out.println("Not found!");

        // int max1, max2;
        // max1 = max2 = B[0];
        // for (int i = 0; i < B.length; i++) {
        // if (B[i] > max1) {
        // // max2 =max1;
        // max2 = B[i];
        // }
        // else {
        // max2=B[i];
        // }
        // }
        // System.out.println(max2);

        // for (int x : A) {
        // System.out.print(x+ ",");
        // System.out.println("");
        // }

        // int temp = A[0];
        // for (int i = 1; i < A.length; i++) {
        // A[i - 1] = A[i];
        // }
        // A[A.length - 1] = temp;

        // for (int x : A) {
        // System.out.print(x+ ",");
        // System.out.print("");
        // }
        int A[] = new int[10];
        A[0] = 1;
        A[1] = 2;
        A[2] = 3;
        A[3] = 4;
        A[4] = 5;
        A[5] = 6;

        int newA[] = new int[A.length-1];

        int j = 3;
    
        for(int i=0,k=0;i<A.length;i++) {
            if(A[i]!=j) {
                newA[k] =A[i];
                k++;
            }
        }
        System.out.println("Before deletion: "+Arrays.toString(A));
        System.out.println("After deletion: "+ Arrays.toString(newA));
         // for (int i = 0; i < ; i++)
        //     System.out.print(A[i] + ",");
        // System.out.println("");

        // int x = 20;
        // int index = 2; // for (int i = n; i > index; i--)
        //     A[i] = A[i - 1];
        // A[index] = x;

        // for (int i = 0; i < n; i++)
        //     System.out.print(A[i] + ",");
        // System.out.println("");

    }
}
