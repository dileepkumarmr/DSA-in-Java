public class ifThenifElse {
    boolean isFilled;
    double billAmount;
    String shipping;

public ifThenifElse(boolean filled, double cost, String shippingMethod){
    if (cost > 24.00) {
    System.out.println("High value item!");
    }
    isFilled = filled;
    billAmount = cost;
    shipping = shippingMethod;
    }

public void ship(){
    if(isFilled) {
        System.out.println("Shipping");
        System.out.println("Shipping cost: " + calculateShipping());
     } else {
        System.out.println("Order not ready");
     }
    }
public double calculateShipping() {
    if (shipping.equals("Return"))
    {
        return 0;
    } else if (shipping.equals("Express"))
    {
        return 1.75;
    } else {
        return .50;
    }

}
public static void main(String args[]){
    ifThenifElse book = new ifThenifElse(true, 9.99, "Regular");
    ifThenifElse chemistrySet = new ifThenifElse(true, 72.50, "Express");

    book.ship();
    chemistrySet.ship();

}


}


