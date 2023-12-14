public class array3 {
    public static void main(String[] args) {

        int A[] = { 8,6,10,9,2,15,7,13,14,11 };
        int B[] = new int[10];

        // for (int i = 0; i < A.length; i++) {
        //     B[i]=A[i];
         
        // }

        // System.out.println("");
        // for (int i = 0; i < A.length; i++) {
        //     System.out.print(A[i] + " ");

        // }

        // for (int i = 0; i < A.length; i++) {
        //     System.out.println(B[i] + " ");
        // }
        // System.out.println("");

        // Reverse copying an array "a"
        for (int i = A.length - 1; i >= 0; i--) 
        {
            B[i] = A[i];
            System.out.print(B[i] + ",");
        }
    }
}
