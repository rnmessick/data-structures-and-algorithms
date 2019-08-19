package code401challenges.stacksandqueues;

public class Node<T> {
    T value;
    Node<T> next;

    public Node(T value) {
        this.value = value;
        this.next = null;
    }

    public Node<T> getNext() {
        return this.next;
    }


    public T getData() {

        return this.value;
    }

}
