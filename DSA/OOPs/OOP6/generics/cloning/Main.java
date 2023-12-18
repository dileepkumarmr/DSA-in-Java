package OOPs.OOP6.generics.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {

        Human kunal = new Human(34, "Kunal");
//    Human twin = new Human(kunal); // cloning

        Human twin = (Human) kunal.clone();
//        System.out.println(twin.name + " " + twin.age);

        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0]=100;

        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(kunal.arr)); // works because of shallowing

    }

}
