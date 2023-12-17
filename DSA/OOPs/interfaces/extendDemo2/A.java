package OOPs.interfaces.extendDemo2;

public interface A {
    // see kunal notes, add to notion
    // Static methods cannot be inherited nor can be overridden.
    // call via interface name.
    static void greeting() {
        System.out.println("Hey, Im static method");
    };
    default void fun(){
        System.out.println("I am in A");
    };
}


