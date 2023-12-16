package OOPs.OOP4.access;

public class ObjectDemo {
    int num;
    float gpa;

    public ObjectDemo(int num, float gpa) {
        this.num = num;
        this.gpa = gpa;
//        super();

    }

        @Override
    public int hashCode() {
        return super.hashCode();
//        return num;

    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.num == ((ObjectDemo)obj).num;
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "ObjectDemo{}";


    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }


    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(12, 6.5f);
        ObjectDemo obj2 = new ObjectDemo(12, 5.8f);

        if (obj1 == obj2) {
            System.out.println("obj1 is equal to obj2");
        }

        if (obj1.equals(obj2)) {
            System.out.println("obj1 is equal to obj2");
        }
        System.out.println(obj1.getClass());
        System.out.println(obj1.getClass().getName());

//        ObjectDemo obj2 = obj;
//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());
    }

}


