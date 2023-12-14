
/**
 * into
 */
public class into {

    public static void main(String[] args) {

        // Student[] students = new Student[1];

        Student dfd = new Student();

        // kunal.rno = 14;
        // kunal.name = "Kunal Khuswaha";
        // kunal.marks = 88.2f;
        // Student kunal = new Student(15, "Kunal Kushwaha", 85.4f);
        // System.out.println(dfd.rno);
        // System.out.println(dfd.name);
        // System.out.println(dfd.marks);

        // dfd.changeName("deeksh");
        // dfd.greeting();
        // System.out.println(dfd.name);

        // Student random = new Student(kunal);

        Student random1 = new Student();

        System.out.println(random1.name);
    }

}

class Student {
    int rno;
    String name;
    float marks = 99;

    // void greeting() {
    // System.out.println("Hello ! My name is " + this.name);
    // }

    void changeName(String newName) {
        this.name = newName;
    }

    Student(Student other) {
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;

    }

    Student() {
        // this.rno = 12;
        // this.name = "Dileep";
        // this.marks = 62.0f;

        this(99, "default", 100);
    }

    Student(int roll, String nam, float marls) {
        this.rno = roll;
        this.name = nam;
        this.marks = marls;

    }
}
