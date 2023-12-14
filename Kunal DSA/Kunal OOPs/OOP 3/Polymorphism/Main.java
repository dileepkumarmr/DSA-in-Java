package Polymorphism;
public class Main {
    public static void main(String[] args) {
        Shapes s = new Shapes();
        s.area();
        s = new Circcle();
        s.area();
        s = new Square();
        s.area();
        s = new Triangle();
        s.area();
    }
}
