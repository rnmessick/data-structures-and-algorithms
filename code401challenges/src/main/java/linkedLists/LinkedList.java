package linkedLists;

public class LinkedList<T> {
    Node<T> head; // head of list

    public LinkedList() {

        this.head = null;
    }

    // Method to insert a new node
    public void insert(T value) {
        this.head = new Node<>(value, this.head);

    }

    //Append to end
    //Was mixing up the head and the current node so kept getting null values
    public void append(T value) {
        Node<T> newNode = new Node<>(value, this.head);
        Node<T> current = this.head;
        // base case
        if (current == null) {
            current = newNode;
            this.head = current;
            return;
        }
        newNode.setNext(null);
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(newNode);
    }


    public void insertBefore(T targetVal, T newValue) {
        Node<T> current = head;

        if (current.value.equals(targetVal)) {
            this.insert(newValue);
            return;
        }
        while (true) {
            if (current.next.value.equals(targetVal)) {
                break;
            } else {
                current = current.next;
            }
        }
        Node<T> newVal = new Node<>(newValue, current.next);
        current.next = newVal;

    }

    public void insertAfter(T targetVal, T newValue) {
        Node<T> current = head;

        if(current.value.equals(targetVal)) {
            Node<T> newVal = new Node<>(newValue, current.next);
            current.next = newVal;
            return;
        }
        while(true) {
            if(current.value.equals(targetVal)) {
                break;
            } else {
                current = current.next;
            }
        }
        current.next = new Node<>(newValue,current.next);


    }
    // Method to see if list contains a value
    public boolean includes(T value) {
        Node<T> current = this.head;
        while (current != null) {
            if (current.getData() == value) {
                return true;

            }
            current = current.getNext();
        }
        return false;
    }

    // to use in testing
    public boolean isEmpty() {
        return length() == 0;
    }

    public int length() {
        int length = 0;
        Node<T> current = head;

        while (current != null) {
            length++;

            current = current.next;
        }
        return length;
    }

    // Method to stringify lists
    public String toString() {
        String result = "HEAD";
        Node<T> current = this.head;
        while (current != null) {
            result += "->" + current.getData();
            current = current.getNext();

        }
        result += "->null";
        return "List: " + result;
    }

//********Node Class********
    static class Node<T> {
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
}
