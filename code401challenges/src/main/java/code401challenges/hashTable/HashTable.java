package code401challenges.hashTable;

import java.util.NoSuchElementException;

public class HashTable<K, V> {

    private Node<K, V>[] buckeyArray;

    //current capacity of array list
    public int numBuckets;

    //current size of array list
    private int size;

    public HashTable(int numBuckets) {
        buckeyArray = new Node[numBuckets];
        size = 0;

    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    // hashing
    private int hash(String key) {
        int hashValue = 0;
        char[] letters = key.toCharArray();
        for (int i = 0; i < letters.length; i++) {
            hashValue += letters[i];
        }

        hashValue = (hashValue * 599) % buckeyArray.length;
        return hashValue;
    }

    //setting
    public void add(K key, V value) {
        // set a var(int) of the hash(key);
        int hashKey = this.hash((String) key);
//        Node<K, V> head = buckeyArray.get(hashKey);
//        System.out.println(key + " " + hashKey);
        // if map[hashKey] exists, create a linked list
        // else, add the node
//        while (head != null) {
        if (this.buckeyArray[hashKey] == null) {
            this.buckeyArray[hashKey] = new Node<>(key, value);
        } else if (this.buckeyArray[hashKey].getKey().equals(key)) {
            this.buckeyArray[hashKey].setValue(value);
        } else {
            //if load factor goes beyond threshold,
            // then we double the hash table size
            if ((1.0 * size) / numBuckets >= .7) {
                Node<K, V>[] tempBucketArray = this.buckeyArray;
                this.buckeyArray = new Node[this.buckeyArray.length * 2];
                size = 0;
                for (int i = 0; i < tempBucketArray.length; i++) {
                    this.add(tempBucketArray[i].getKey(), tempBucketArray[i].getValue());
                }
            }
        }

    }

    //getting
    public V get(K key) {
        // hash the key
        //if the hash table has the key, send back the value of the node
        int hashKey = this.hash((String) key);
        if (this.buckeyArray[hashKey] != null && this.buckeyArray[hashKey].getKey().equals(key)) {
            return this.buckeyArray[hashKey].getValue();
        } else {
            throw new NoSuchElementException("The key does not exists");
        }
    }

    //has()
    public boolean contains(String key) {
        int hashKey = hash(key);
        // go through the list and check the actual value
        if (this.buckeyArray[hashKey] != null && this.buckeyArray[hashKey].getKey().equals(key)) {
            return true;
        } else {
            return false;
        }
    }

}
