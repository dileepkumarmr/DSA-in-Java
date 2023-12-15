import java.util.*;
public class method {
    
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        String name = sc.next();
        String pass = greeting(name);
        System.out.println(pass);
    }
    static String greeting(String name) {
    String msg = "Hello"+name;
    return msg;
    }
    
}