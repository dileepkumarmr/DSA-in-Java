public class scopeCar {
    String color;
    int milesDriven;

public scopeCar(String carColor) {
    color = carColor;
    milesDriven = 1895;
}
public void drive() {
    String message = "Miles driven: "+milesDriven;
    System.out.println(message);
}
public static void main(String args[]) {
scopeCar myFastCar = new scopeCar("Green");
myFastCar.drive();
}
}
