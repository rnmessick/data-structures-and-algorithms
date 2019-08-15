package linkedLists;

public class Node<T> {

    T value;
    Node<T> next;

    // Constructor to create a new node
    // Next is by default initialized as null
    public Node(T value, Node next) {
        this.value = value;
        this.next = next;
    }

    public void setNext(Node<T> next) {
        this.next = next;

    }

    public Node<T> getNext() {
        return this.next;
    }

    public T getData() {

        return this.value;
    }
}
