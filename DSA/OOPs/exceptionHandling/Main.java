package OOPs.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
//            int c = a / b;
//            divide(a, b);
//            mimicing
//            throw new Exception("Just for fun");
            String name = "Kunal";
            if (name.equals("Kunal")) {
                throw new MyException("name is Kunal");
            }

        } catch (MyException e) {
            System.out.println(e.getMessage());

        } catch (ArithmeticException e) {  // most strict (includes only Arithmetic) & this should be on TOP
            System.out.println(e.getMessage());
        } catch (Exception e) {  // includes all Exceptions
            System.out.println("normal exception");
        } finally {
            System.out.println("This always execute");
        }


    }

    static int divide(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Please donot divide by zero"); // custom msg.
        }

        return a / b;
    }
}
