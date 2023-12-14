public class test {

    // A method that accept integer as parameter
    public static void method(int d) {
        System.out.println(
                "Automatic Type Promoted possible from high to small?");
    }

    public static void main(String[] args) {
        // method call with double as parameter
        method((int)2.02);
    }

}
