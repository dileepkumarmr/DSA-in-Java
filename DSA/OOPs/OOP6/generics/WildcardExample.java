package OOPs.OOP6.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class
//CustomGenArrayList
WildcardExample
        <T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // work as index val

    public
//    CustomGenArrayList
    WildcardExample
    () {
        data = new Object[DEFAULT_SIZE];
    }

    public void getList(List<? extends Number> list) {
//

//    only number type
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

//    copy to new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = (data[i]);
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T removed = (T) data[--size];
        return removed;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value) {
        data[index] = value;
    }

    //    alt+insert
    @Override
    public String toString() {
        return "CustomArrayList{" + "data=" + Arrays.toString(data) + ", size=" + size + '}';
    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();

//        list.add(3);
//        list.add(5);
//        list.add(9);
//        list.set(7, 5);


//        System.out.println(list);


        ArrayList<Integer> list2 = new ArrayList<>();

//        CustomGenArrayList<Integer> list3 = new CustomGenArrayList<>();
//
////        list3.add(45);
//        for (int i = 0; i < 14; i++) {
//            list3.add(2 * i);
//        }
//        System.out.println(list3);

        WildcardExample<Integer> list4 = new WildcardExample<>();
        WildcardExample<Number> list5 = new WildcardExample<>();
    }

}
