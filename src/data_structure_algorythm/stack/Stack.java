package data_structure_algorythm.stack;

public class Stack {
    class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
        }
    }

    private Node top;
    private int height;


    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    public void getTop() {
        System.out.println("Top: " + top.value);
    }

    public void getHeight() {
        System.out.println("Height: " + height);
    }

    public void printStack() {
        Node temp = top;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
}