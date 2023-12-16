package OOPs.OOP5.abstractDemo;

public abstract class Parent {

    int age;
    final int VALUE;

    public Parent(int age) {
        this.age = age;
        VALUE = 32456789;
    }

    static void hello() {
        System.out.println("Hey");
    }

    void normal() {
        System.out.println("this is normal method");
    }


    abstract void career();

    abstract void partner();
}
