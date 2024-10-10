package data_structure_algorythm.binary_search_tree;

import java.util.ArrayList;

public class TestBinarySearchTree {
    public static void main(String[] args) {
        BinarySearchTree myBST = new BinarySearchTree();
//        myBST.insert(2);
//        myBST.insert(1);
//        myBST.insert(3);

        myBST.rInsert(1);
        myBST.rInsert(2);
        myBST.rInsert(3);

        System.out.println("root = " + myBST.root.value);
        System.out.println("root->Left: = " + myBST.root.left.value);
        System.out.println("root->Right: = " + myBST.root.right.value);

        System.out.println("bfs: = " + myBST.bfs());


    }
}
