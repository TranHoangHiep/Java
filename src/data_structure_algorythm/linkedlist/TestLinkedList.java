package data_structure_algorythm.linkedlist;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(4);
        linkedList.printLinkedList();

        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();

        linkedList.append(5);
        System.out.println("---> Linked list after appending 5: ");
        linkedList.printLinkedList();

        System.out.println("---> Removing last element " + linkedList.removeLast().value + " from linked list ");
        System.out.println("---> Linked list after removing last: ");
        linkedList.printLinkedList();

    }
}
