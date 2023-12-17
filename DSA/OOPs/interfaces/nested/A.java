package OOPs.interfaces.nested;

public class A {
//    NestedInterface
    public interface NestedInterface {
    boolean isOdd(int num);
    }

}
class B implements A.NestedInterface {

    @Override
    public boolean isOdd(int num) {
        return (num & 1)==1;
    }
}
