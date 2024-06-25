package data_structure_algorythm.linkedlist;

public class TestDoublyLinkedList {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(5);
        doublyLinkedList.printLinkedList();

        doublyLinkedList.getHead();
        doublyLinkedList.getTail();
        doublyLinkedList.getLength();

        System.out.println("---> DoublyLinkedList after append");
        doublyLinkedList.append(6);
        doublyLinkedList.printLinkedList();

        System.out.println("---> DoublyLinkedList remove last item: " + doublyLinkedList.removeLast().value);
        doublyLinkedList.printLinkedList();

        System.out.println("---> DoublyLinkedList after prepend");
        doublyLinkedList.prepend(4);
        doublyLinkedList.printLinkedList();
    }
}
