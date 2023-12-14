public class finalKey {
    public static void main(String[] args) {

        /*finalint sal = 2;

        sal = 6;
        System.out.println(sal);*/

       final A dileep = new A ("DIleep");
        dileep.name = "other name";

        dileep = new A("new obj");
    }
}



class A {

    final int num = 10;
    String name;

    public A(String name) {
        this.name = name;
    }

    

}