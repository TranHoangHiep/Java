package data_structure_algorythm.stack;

import data_structure_algorythm.linkedlist.LinkedList;

public class TestStack {
    public static void main(String[] args) {
        Stack stack = new Stack(4);
        stack.printStack();

        stack.getTop();
        stack.getHeight();

        stack.push(5);
        System.out.println("---> Stack after pushing 5: ");
        stack.printStack();

        stack.pop();
        System.out.println("---> Stack after poping: ");
        stack.printStack();
    }
}
