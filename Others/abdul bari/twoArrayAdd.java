public class twoArrayAdd {
    public static void main(String[] args) {

        int A[][] = { { 1, 3, 5 }, { 2, 4, 6 }, { 1, 2, 3 } };
        int B[][] = { { 1, 3, 5 }, { 2, 4, 6 }, { 1, 2, 3 } };
        int C[][];
        C = new int[3][3];
      

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j]+ " ");
            }
            System.out.println(" ");
        }
    }
}
