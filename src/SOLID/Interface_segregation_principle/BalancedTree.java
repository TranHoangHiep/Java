package SOLID.Interface_segregation_principle;

public class BalancedTree implements RotationTree {
    @Override
    public void leftRotation() {
        System.out.println("Left Rotation");
    }

    @Override
    public void rightRotation() {
        System.out.println("Right Rotation");
    }

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
