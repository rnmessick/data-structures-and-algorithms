package code401challenges.stacksandqueues;

public class Queue {
    Node front;
    Node back;

    public Queue(Node front, Node back) {
        this.front = front;
        this.back = back;
    }

    public Queue() {

    }

    public void enqueue(Node node) {
        if (front == null) {
            this.front = node;
            this.back = node;
        } else {
            back.setNext(node);
            back = node;
        }
    }

    public Node dequeue() {
        Node temp = this.front;
        this.front = front.next;
        temp.next = null;

        return temp;
    }

    public String peek() {
        if (front == null) {
            return "FRONT is null. Don't dequeue!";
        } else {
            return ("Front node is: " + front);
        }
    }

    public String toString() {
        String result = "FRONT";
        Node current = this.front;
        while (current != null) {
            result += "<-" + current.getData();
            current = current.getNext();

        }
        result += "<-null";
        return "Queue: " + result;
    }

}
