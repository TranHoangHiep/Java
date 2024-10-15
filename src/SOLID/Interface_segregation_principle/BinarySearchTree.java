package SOLID.Interface_segregation_principle;

public class BinarySearchTree implements Tree{
    @Override
    public void insert() {
        System.out.println("Inserting a new element");
    }

    @Override
    public void delete() {
        System.out.println("Deleting a element");
    }

    @Override
    public void traverse() {
        System.out.println("Traversing a tree");
    }
}
