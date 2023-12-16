package OOPs.OOP4.access;

import java.util.ArrayList;

//  SubClass1
public class SubClass extends A {
    public SubClass(int num, String name) {
        super(num, name);
//        Object
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(45, "Kunal");
        int n = obj.num;

        System.out.println(obj instanceof A);
        System.out.println(obj instanceof SubClass);
        System.out.println(obj instanceof Object);
//        A obj=new A(45,"Kunal");
//        int n = obj.num;
    }
}

// SubSubClass
class SubSubClass extends SubClass {
    public SubSubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(45, "Kunal");
        int n = obj.num;

//        A obj=new A(45,"Kunal");
//        int n = obj.num;
    }
}

//  SubClass2
class SubClass2 extends A {
    public SubClass2(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
//        SubClass obj=new SubClass(45,"Kunal");
//        int n = obj.num;

        SubClass2 obj = new SubClass2(45, "Kunal");
        int n = obj.num;
    }
}