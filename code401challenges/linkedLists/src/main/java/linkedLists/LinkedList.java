package linkedLists;

public class LinkedList {
    Node head; // head of list

    public boolean isEmpty() {
        return length() == 0;
    }

    int length() {
        int length = 0;
        Node current = head;

        while(current != null){
            length ++;

            current = current.next;
        }
        return length;
    }

    static class Node {
        String data;
        Node next;

        // Constructor to create a new node
        // Next is by default initialized as null
        Node(String d)
        {
            data = d;
            next = null;
        }
    }

    // Method to insert a new node
    public LinkedList Insert(LinkedList list, String data)
    {
        // Create a new node with given data
        Node newNode = new Node(data);
        newNode.next = null;

        // if linked list is empty, new node is head
        if (list.head == null) {
            list.head = newNode;
        }
        else {
            // traverse until the last node and insert new node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
            //insert new node at last node
            last.next = newNode;
        }

        // return list by head
        return list;
    }

}


