public class Store {
    String productType;

public Store(String product) {
    product = productType;
}
public void advertise() {
String message = "Selling " + productType + "!";
System.out.println(message);
}
public static void main(String args[]) {

String cookie = "Cookies";
Store cookieshop = new Store(cookie);

cookieshop.advertise();

}
}
