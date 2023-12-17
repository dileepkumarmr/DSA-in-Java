package OOPs.interfaces.extendDemo2;

public class Main implements A, B {
    @Override
    public void greet() {
//        System.out.println("Greeting");
    }

//    @Override
//    public void fun() {
//
//    }

    public static void main(String[] args) {
        Main obj = new Main();
// call via interface name.
        A.greeting();
    }
}
