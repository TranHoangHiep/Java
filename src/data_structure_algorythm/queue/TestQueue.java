package data_structure_algorythm.queue;

import data_structure_algorythm.stack.Stack;

public class TestQueue {
    public static void main(String[] args) {
        Queue queue = new Queue(4);
        queue.printQueue();

        queue.getFirst();
        queue.getLast();
        queue.getLength();
    }
}
