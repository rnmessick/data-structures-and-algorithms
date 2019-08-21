package code401challenges.stacksandqueues;

public class Queue<T> {
    Node<T> front;
    Node<T> back;

    public Queue(Node<T> front, Node<T> back) {
        this.front = front;
        this.back = back;
    }

    public Queue() {

    }

    public void enqueue(T newValue) {
        Node<T> newNode = new Node<>(newValue);
        if (front == null) {
            this.front = newNode;
            this.back = newNode;
        } else {
            back.next = newNode;
            back = newNode;
        }
    }

    public T dequeue() {
        Node<T> temp = this.front;
        front = front.next;
        temp.next = null;

        return (T) temp;
    }

    public T peek() {
        if (front == null) {
            return (T) "FRONT is null. Don't dequeue!";
        } else {
            return (T) ("Front node is: " + front);
        }
    }

    public String toString() {
        String result = "FRONT";
        Node<T> current = this.front;
        while (current != null) {
            result += "<-" + current.getData();
            current = current.getNext();

        }
        result += "<-null";
        return "Queue: " + result;
    }

}
