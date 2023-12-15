public class classStore {
    // instance fields
    String productType;
    int inventoryCount;
    double inventoryPrice;
    
    // contructor method
public classStore (String product, int count, double price) {
    productType = product;
    inventoryCount = count;
    inventoryPrice = price;
}
//main method
public static void main (String args[])
    {
        classStore lemonadeStand = new classStore ("lemonade", 50, 5.25);

        classStore cookieShop = new classStore ("cookies", 60 , 6.99);

        System.out.println("Our first shop sells " + lemonadeStand.productType +"at " + lemonadeStand.inventoryCount +"per unit." );
        System.out.println("Our secons shop sell" + cookieShop.productType + "has " + cookieShop.inventoryCount + "units remaining.");

    }
    
}
