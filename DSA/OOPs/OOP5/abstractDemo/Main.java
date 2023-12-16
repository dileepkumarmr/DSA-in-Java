package OOPs.OOP5.abstractDemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();

        son.normal();

        Daughter daughter = new Daughter(28);
        daughter.career();

//        Parent mom = new Parent(45);

        Parent.hello();

    }
}
