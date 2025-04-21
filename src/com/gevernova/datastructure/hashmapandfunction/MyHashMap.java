package com.gevernova.datastructure.hashmapandfunction;
import java.util.LinkedList;

public class MyHashMap {
    // Define the bucket array size (prime number for better distribution)
    private static final int SIZE = 1000;

    // Array of LinkedLists to store the key-value pairs
    private LinkedList<Entry>[] table;

    // Constructor
    public MyHashMap() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Hash function to calculate the index in the array
    private int hash(int key) {
        return Integer.hashCode(key) % SIZE;
    }

    // Insert key-value pair into the hash map
    public void put(int key, int value) {
        int index = hash(key);
        LinkedList<Entry> list = table[index];

        // Check if the key already exists and update the value if so
        for (Entry entry : list) {
            if (entry.key == key) {
                entry.value = value;
                return;
            }
        }

        // If key doesn't exist, create a new entry and add it
        list.add(new Entry(key, value));
    }

    // Retrieve the value for a given key
    public int get(int key) {
        int index = hash(key);
        LinkedList<Entry> list = table[index];

        // Search through the linked list in the corresponding bucket
        for (Entry entry : list) {
            if (entry.key == key) {
                return entry.value;
            }
        }

        return -1; // Return -1 if key is not found
    }

    // Delete a key-value pair
    public void remove(int key) {
        int index = hash(key);
        LinkedList<Entry> list = table[index];

        // Iterate through the linked list and remove the key if found
        for (Entry entry : list) {
            if (entry.key == key) {
                list.remove(entry);
                return;
            }
        }
    }

    // Entry class to store key-value pairs
    private static class Entry {
        int key;
        int value;

        Entry(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    // For testing purposes
    public static void main(String[] args) {
        MyHashMap map = new MyHashMap();

        map.put(1, 100);
        map.put(2, 200);
        map.put(3, 300);
        map.put(1001, 400);

        System.out.println("Get key 1: " + map.get(1));  // Output: 100
        System.out.println("Get key 2: " + map.get(2));  // Output: 200
        System.out.println("Get key 1001: " + map.get(1001));  // Output: 400

        map.remove(2);
        System.out.println("Get key 2 after removal: " + map.get(2));  // Output: -1
    }
}
