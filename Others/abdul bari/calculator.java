import java.util.*;

public class calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("DIV");
        
        System.out.println("Enter two Nos: ");

        int x =sc.nextInt();
        int y =sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Option in words.");
        
        String option =sc.nextLine();
        option = option.toUpperCase();

        switch(option)
        {
            case "ADD" : System.out.println("Sum is: "+(x+y));
            break;
            case "SUB" : System.out.println("Sub is: "+(x-y));
            break;
            case "MUL" : System.out.println("Mul is: "+(x*y));
            break;
            default : System.out.println("Invalid Option");
        }

    }
}
