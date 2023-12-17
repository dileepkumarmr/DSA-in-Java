package OOPs.cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Human kunal = new Human(34, "Kunal");
//    Human twin = new Human(kunal); // cloning
        Human twin = (Human) kunal.clone();
        System.out.println(twin.name + " " + twin.age);
    }

}
