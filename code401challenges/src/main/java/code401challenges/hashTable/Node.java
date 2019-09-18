package code401challenges.hashTable;

public class Node<K, V> {

    public  K key;
    public V value;
    public  Node next;


    public Node(K key, V value) {
        setKey(key);
        setValue(value);
    }

    public K getKey() {
        return key;
    }
    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Key: " + this.key + " Value: " + this.value;
    }
}
