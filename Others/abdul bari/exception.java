public class exception {
    public static void main(String[] args) {
        int A[] ={30,20,10,40,0};
    try {
        int c = A[1]/A[2];
        System.out.println(c);
        /*Can be written in 2 methods */
        
        
        
        try {
        System.out.println(A[5]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is invalid");
        }
        /*no need */
    }

    catch(ArithmeticException e) {
        System.out.println("Denominator should not be zero");

    }
    /*
     {
        catch(ArrayIndexOutOfBoundsException e) {
        System.out.println("Index is invalid");

        can be written here...
     }
     */
    System.out.println("bye");
}
    
}
