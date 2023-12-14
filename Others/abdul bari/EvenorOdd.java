import java.util.Scanner;

public class EvenorOdd {
    public static void main(String[] args) {

        System.out.println("Enter a Number: ");

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        

        if(num%2==0) {
            System.out.println("its even");
        }
        else {
            System.out.println("its odd");
        }
        in.close();
    }

}