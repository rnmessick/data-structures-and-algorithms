package code401challenges.hashTable;

public class Node<K, V> {

    public  K key;
    public V value;
    public  Node next;

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(K key, V value) {
        setKey(key);
        setValue(value);
    }
}
