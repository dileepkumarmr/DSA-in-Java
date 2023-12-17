package OOPs.OOP6.generics.comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student kunal = new Student(12, 89.76f);
        Student rahul = new Student(5, 99.76f);
        Student arpit = new Student(2, 95.76f);
        Student karan = new Student(13, 77.76f);
        Student sachin = new Student(9, 96.76f);

        Student[] list = {kunal, rahul, arpit, karan, sachin};

        System.out.println(Arrays.toString(list));

//        Arrays.sort(list);
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
//                return (int) (o1.marks - o2.marks); // Ascending
                return -(int) (o1.marks - o2.marks); // Desc.
            }
        });

//        Lambda Expression

        Arrays.sort(list, (o1, o2) -> {
            return (int) (o1.marks - o2.marks); // Ascending
//            return -(int) (o1.marks - o2.marks); // Desc.
        });


        System.out.println(Arrays.toString(list));

//        if (kunal.compareTo(rahul) < 0) {
//            System.out.println(kunal.compareTo(rahul));
//            System.out.println("Rahul has more marks.");
//        }
    }
}
