import java.util.Scanner;

/**
 * LeapYear
 */
public class LeapYear {

    public static boolean leap(int year) {

        if ((year%4==0 && year%100!=0) || year%400==0) {
            return true;
        } 
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (leap(year)) {
            System.out.println("sss");
        } else {

            System.out.println("noo");
        }
    }
}