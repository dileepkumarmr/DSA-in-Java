package Stacks;

import java.util.Stack;

public class StackImp {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("dip");
        stack.push("das");

        stack.pop();
        System.out.print(stack);
    }
}
