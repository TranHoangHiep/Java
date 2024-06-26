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

        linkedList.prepend(3);
        System.out.println("---> Linked list after prepending 3: ");
        linkedList.printLinkedList();

        System.out.println("---> Removing first element " + linkedList.removeFirst().value + " from linked list ");
        System.out.println("---> Linked list after removing first: ");
        linkedList.printLinkedList();

        System.out.println("---> Get element with index 0 is: " + linkedList.get(0).value + " from linked list ");

        
        System.out.println("---> Linked list after set item with index 0 with value 5: ");
        linkedList.set(0, 5);
        linkedList.printLinkedList();

        System.out.println("---> Linked list after set item with index 1 with value 6: ");
        linkedList.insert(1, 6);
        linkedList.printLinkedList();

        System.out.println("---> Removing element " + linkedList.remove(1).value + " from linked list ");
        System.out.println("---> Linked list after removing: ");
        linkedList.printLinkedList();

        linkedList.append(6);
        linkedList.append(7);
        linkedList.append(8);
        linkedList.append(9);
        System.out.println("---> Linked list before reverse ");
        linkedList.printLinkedList();

        linkedList.reverse();
        System.out.println("---> Linked list after reverse ");
        linkedList.printLinkedList();



    }
}
