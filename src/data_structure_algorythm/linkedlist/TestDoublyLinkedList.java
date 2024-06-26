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

        System.out.println("---> DoublyLinkedList remove first item: " + doublyLinkedList.removeFirst().value);
        doublyLinkedList.printLinkedList();

        System.out.println("---> DoublyLinkedList get item with index 0 is: " + doublyLinkedList.get(1).value);

        System.out.println("---> DoublyLinkedList after set item 0 to 6");
        doublyLinkedList.set(0, 6);
        doublyLinkedList.printLinkedList();

        System.out.println("---> DoublyLinkedList add two more itemw");
        doublyLinkedList.append(7);
        doublyLinkedList.append(8);
        doublyLinkedList.printLinkedList();
        System.out.println("---> DoublyLinkedList after insert index 1 with value 9");
        doublyLinkedList.insert(1, 9);
        doublyLinkedList.printLinkedList();
    }
}
