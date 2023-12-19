package OOPs.OOP7.collections.enumExample;

public class Basic {
    enum Week implements A {
        mon, tue, wed, thu, fri, sat;

        Week() {
            System.out.println("Constructor "+ this);
        }

        @Override
        public void hello() {
            System.out.println("Hey how r u");
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.mon;
        week.hello();
        System.out.println(Week.valueOf("mon"));
//        for (Week day : Week.values()) {
//            System.out.println(day);
//        }

//        System.out.println(week.ordinal());
    }


}
