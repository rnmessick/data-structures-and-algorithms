package code401challenges.hashTable;

import java.util.ArrayList;

class HashTable<K, V> {

    private ArrayList<Node<K, V>> buckeyArray;

    //current capacity of array list
    public int numBuckets;

    //current size of array list
    private int size;

    public HashTable() {
        buckeyArray = new ArrayList<>();
        numBuckets = 10;
        size = 0;

        //creating empty chains
        for ( int i = 0; i < numBuckets; i++) {
            buckeyArray.add(null);
        }
    }

    public int size() { return size; }
    public boolean isEmpty() { return size() == 0; }

    // hashing
    private int hash(String key) {
        int hashValue = 0;
        char[] letters = key.toCharArray();
        for(int i = 0; i < letters.length; i++) {
            hashValue += letters[i];
        }

        hashValue = (hashValue * 599) % buckeyArray.size();
        return hashValue;
    }

    //setting
    public void add(K key, V value) {
        // set a var(int) of the hash(key);
        int hashKey = hash((String) key);
        Node<K, V> head = buckeyArray.get(hashKey);
        System.out.println(key + " " + hashKey);

        // if map[hashKey] exists, create a linked list
        // else, add the node
        while ( head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            } else {
                head = head.next;
            }
        }
        //inserting key into chain
        size++;
        head = buckeyArray.get(hashKey);
        Node<K, V> newNode = new Node<K, V>(key, value);
        newNode.next = head;
        buckeyArray.set(hashKey, newNode);

       //if load factor goes beyond threshold,
        // then we double the hash table size
       if ((1.0* size)/numBuckets >= .7) {
           ArrayList<Node<K, V>> temp = buckeyArray;
           buckeyArray = new ArrayList<>();
           numBuckets = 2 * numBuckets;
           size = 0;
           for ( int i = 0; i < numBuckets; i++) {
               buckeyArray.add(null);
           }
           for ( Node<K, V> headNode : temp) {
               while ( headNode != null) {
                   add(headNode.key, headNode.value);
                   headNode = headNode.next;
               }
           }
       }
    }

    //getting

    public V get(K key) {
        // hash the key
        //if the hash table has the key, send back the value of the node
        int hashKey = hash((String) key);
        Node<K, V> head = buckeyArray.get(hashKey);

        //search key in chain
        while ( head != null) {
            if(head.key.equals(key)) {
                return (V) head.value;
            }
            head = head.next;
            }
        return null;
        }


    //has()
    public boolean contains(String key) {
        int hashKey = hash(key);
        // go through the list and check the actual value

        return buckeyArray.get(hashKey) != null;
    }

}
