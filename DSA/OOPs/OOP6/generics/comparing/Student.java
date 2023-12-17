package OOPs.OOP6.generics.comparing;

public class Student implements Comparable<Student> {
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return marks + " " + rollno;
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("In compareTo method");
        int diff = (int) (this.marks - o.marks);
        return diff;
    }
}
