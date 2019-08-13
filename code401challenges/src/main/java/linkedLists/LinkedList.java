package linkedLists;

public class LinkedList<T> {
    Node<T> head; // head of list

    public LinkedList() {
        this.head = null;
    }

    // Method to insert a new node
    public void Insert(T value) {
        Node newNode = new Node(value, this.head);
        this.head = newNode;

    }

    //Append to end
    public void Append(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.next = null;
        // base case
        if (head == null) {
            head = newNode;
        } else {
            Node<T> last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
        }

    }

    // Method to see if list contains a value
    public boolean Includes(T value) {
        Node current = this.head;
        while (current != null) {
            if (current.getData() == value) {
                return true;

            }
            current = current.getNext();
        }
        return false;
    }

    public boolean isEmpty() {
        return length() == 0;
    }

    public int length() {
        int length = 0;
        Node current = head;

        while (current != null) {
            length++;

            current = current.next;
        }
        return length;
    }

    // Method to stringify lists
    public String toString() {
        String result = "HEAD";
        Node current = this.head;
        while (current != null) {
            result += "->" + current.getData();
            current = current.getNext();

        }
        result += "->null";
        return "List: " + result;
    }

    static class Node<T> {
        private T value;
        Node next;

        // Constructor to create a new node
        // Next is by default initialized as null
        public Node(T value, Node next) {
            this.value = value;
            this.next = next;
        }

        public Node(T value) {
        }

        public void setNext(Node next) {
            this.next = next;

        }

        public Node getNext() {
            return next;
        }

        public T getData() {
            return this.value;
        }
    }
}


