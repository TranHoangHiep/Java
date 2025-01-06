package data_structure_algorythm.doublelinkedlist;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList(1);
        dll.append(2);

        dll.printLinkedList();

        System.out.println("===> After remove last");
        dll.removeLast();
        dll.printLinkedList();

        System.out.println("===> After prepend");
        dll.prepend(0);
        dll.printLinkedList();
    }

}
