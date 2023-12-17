package OOPs.OOP6.generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i);
        }

//        arr.forEach((item) -> {
//            System.out.println(item * 2);
//        });

        Consumer<Integer> fun = (item) -> System.out.println(item * 2);
        arr.forEach(fun);

//        Operation sum = Integer::sum;
        Operation sum = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        Operation mul = (a, b) -> a * b;

        LambdaFunctions myCalculator = new LambdaFunctions();
        System.out.println(myCalculator.operate(5, 6, sum));
        System.out.println(myCalculator.operate(5, 5, mul));
        System.out.println(myCalculator.operate(5, 8, mul));
    }

//    static int sum(int a, int b) {
//        return a + b;
//    }

    private int operate(int a, int b, Operation op) {
        return op.operation(a, b);
    }

}

interface Operation {
    int operation(int a, int b);
}
