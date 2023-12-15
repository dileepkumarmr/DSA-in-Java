public class incrSizeArray3 {
    public static void main(String[] args) {

        int a[] = { 0, 1, 2, 3, 4 };
        System.out.println(a.length);
        // specifying the length of "b" array
        int b[] = new int[2 + a.length];

        for (int i = 0; i < a.length; i++) {
            // copying the array elements from a to b
            b[i] = a[i];
        }
        
        a = b;
        b = null;
        System.out.println(a.length);
    }
}
