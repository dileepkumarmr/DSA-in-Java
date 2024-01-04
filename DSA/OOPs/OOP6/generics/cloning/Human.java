package OOPs.OOP6.generics.cloning;

public class Human implements Cloneable {
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3, 4, 5, 6, 9, 1};
    }

//    public Human(Human other) {
//        this.age = other.age;
//        this.name = other.name;
//    }

//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        // shallow copy
//        return super.clone();
//    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // Deep copy
        Human twin = (Human) super.clone(); // Actually shallow copy

        // make a deep copy
        twin.arr = new int[twin.arr.length];

//        for (int i = 0; i < twin.arr.length; i++) {
//            twin.arr[i] = this.arr[i];
//        }

        // enhanced
        System.arraycopy(this.arr, 0, twin.arr, 0, twin.arr.length);
        return twin;
    }
}
