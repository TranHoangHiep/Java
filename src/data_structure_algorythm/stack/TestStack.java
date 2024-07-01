package data_structure_algorythm.stack;

import data_structure_algorythm.linkedlist.LinkedList;

public class TestStack {
    public static void main(String[] args) {
        Stack stack = new Stack(4);
        stack.printStack();

        stack.getTop();
        stack.getHeight();

    }
}
