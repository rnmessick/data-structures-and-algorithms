package linkedLists;

import java.util.ArrayList;
import java.util.List;

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

        if (current.value.equals(targetVal)) {
            Node<T> newVal = new Node<>(newValue, current.next);
            current.next = newVal;
            return;
        }
        while (true) {
            if (current.value.equals(targetVal)) {
                break;
            } else {
                current = current.next;
            }
        }
        current.next = new Node<>(newValue, current.next);


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

    // Write a method for the Linked List class which takes a number, k, as a parameter.
    // Return the node’s value that is k from the end of the linked list.
    public String kthFromEnd(int k) {
        List<T> tempList = new ArrayList<>();
        Node<T> current = this.head;

        while (current != null) {
            tempList.add(current.getData());
            current = current.getNext();
        }
        int checkIndex = tempList.size() - 1 - k;
        if (checkIndex < 0) {
            return "Exception";
        } else {
            return tempList.get(checkIndex).toString();
        }

    }

    public LinkedList<T> mergeLists(LinkedList<T> list1, LinkedList<T> list2) {
        Node<T> current1 = list1.head;
        Node<T> current2 = list2.head;

        Node<T> next1;
        Node<T> next2;

        // here is the zipper
        while (current1 != null && current2 != null) {
            next1 = current1.getNext();
            next2 = current2.getNext();

            current1.setNext(current2);
            current2.setNext(next1);

            current1 = next1;
            current2 = next2;
        }
        return list1;

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

}