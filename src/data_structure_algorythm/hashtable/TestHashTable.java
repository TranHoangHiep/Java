package data_structure_algorythm.hashtable;

public class TestHashTable {
    public static void main(String[] args) {
        HashTable myHashTable = new HashTable();

        myHashTable.printTable();

        System.out.println("---> HashTable after adding 2 new nodes");
        myHashTable.set("nails", 100);
        myHashTable.set("tile", 50);
        myHashTable.printTable();

    }
}
