package OOPs.OOP5.abstractDemo;

public class Son extends Parent {
    public Son(int age) {
//        this.age=age;
        super(age);
    }

    void normal() {
        super.normal();
    }


    @Override
    void career() {
        System.out.println("I am going to be a doctor");
    }

    @Override
    void partner() {
        System.out.println("I love Pepper potts");
    }
}
