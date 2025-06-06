package data_structure_algorythm.hashtable;

import java.util.ArrayList;

public class HashTable1 {

    class Node {
        String key;
        int value;
        Node next;
        Node(String key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private int size = 7;
    private Node[] dataMap;

    public HashTable1() {
        dataMap = new Node[size];
    }

    public void printTable() {
        for(int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while(temp!= null) {
                System.out.println("  {" + temp.key + "= " + temp.value + "}");
                temp = temp.next;
            }
        }
    }

    private int hash(String key) {
        int hash = 0;
        char[] keychars = key.toCharArray();
        for(int i = 0; i <keychars.length; i++) {
            int ascciValue = keychars[i];
            hash = (hash + ascciValue * 23) % dataMap.length;
        }

        return hash;
    }

    public void set(String key, int value) {
        int index = hash(key);
        Node newNode = new Node(key, value);
        if (dataMap[index] == null) {
            dataMap[index] = newNode;
        } else {
            Node temp = dataMap[index];
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    public int get(String key) {
        int index = hash(key);
        Node temp = dataMap[index];
        while(temp != null) {
            if (temp.key == key){
                return temp.value;
            }
            temp = temp.next;
        }
        return 0;
    }
    
    public ArrayList keys() {
        ArrayList keys = new ArrayList<>();
        for(int i = 0; i < dataMap.length; i++) {
            Node temp = dataMap[i];
            while(temp != null) {
                keys.add(temp.key);
                temp = temp.next;
            }
        }

        return keys;
    }
}
