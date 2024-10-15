package SOLID.Interface_segregation_principle;

public class Test {
    public static void main(String[] args) {
        Tree tree = new BinarySearchTree();

        tree.insert();
        tree.delete();
        tree.traverse();

        System.out.println("------ tree 2 -----");
        RotationTree tree2 = new BalancedTree();

        tree2.insert();
        tree2.delete();
        tree2.traverse();
        tree2.leftRotation();
        tree2.rightRotation();
    }
}
