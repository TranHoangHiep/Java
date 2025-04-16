package data_structure_algorythm.hashtable;

public class App {
    public static void main(String[] args) {
        HashTable1 hashTable1 = new HashTable1();

        hashTable1.set("hiep", 10);
        hashTable1.set("nga", 9);
        hashTable1.set("my", 8);
        hashTable1.set("truc", 7);
        hashTable1.printTable();

        System.out.println(hashTable1.get("hiep"));

    }
}
