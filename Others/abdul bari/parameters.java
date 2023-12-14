public class parameters {
    String color;
public parameters(String carColor) {
color = carColor;
}
public void startRadio(double stationNum, String stationName) {
System.out.println("Turning on the radio to" + stationNum + "," + stationName);
System.out.println("Enjoy!");
}
public static void main(String args[]) {
    parameters myCar = new parameters ("red");
    myCar.startRadio(100.6, "RED FM");

}
}
