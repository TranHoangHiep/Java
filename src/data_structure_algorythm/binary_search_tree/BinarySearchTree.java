package data_structure_algorythm.binary_search_tree;

public class BinarySearchTree {
    class Node {
        int value;
        Node left;
        Node right;
        Node(int value) {
            this.value = value;
        }
    }
    Node root;

    public boolean insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return true;
        }
        Node temp = root;
        while(true) {
            if (temp.value == newNode.value) return false;
            if (newNode.value < temp.value) {
                if (temp.left == null) {
                   temp.left = newNode;
                   return true;
                }
                temp = temp.left;
            } else {
                if (temp.right == null) {
                    temp.right = newNode;
                    return true;
                }
                temp = temp.right;
            }
        }
    }

    public boolean constrains(int value) {
        Node temp = root;
        while(temp != null) {
            if (value < temp.value) { 
                temp = temp.left;
            } else if (value > temp.value) {
                temp = temp.right;
            } else {
                return true;
            }
        }
        return false;
    }

    // recursive
    public void rInsert(int value) {
        if (root == null) root = new Node(value);
        rInsert(root, value);
    }

    private Node rInsert(Node currentNode, int value) {
        if (currentNode == null) return new Node(value);
        if (value < currentNode.value) {
            currentNode = rInsert(currentNode.left, value);
        } else if (value > currentNode.value) {
            currentNode = rInsert(currentNode.right, value);
        }

        return currentNode;
    }
}
