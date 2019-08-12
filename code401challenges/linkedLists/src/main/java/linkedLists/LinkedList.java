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

    // Method to stringify lists
    public String toString() {
        String result = "";
        Node current = head;
        while(current.getNext() != null){
            result += current.getData();
            if(current.getNext() != null){
                result += ", ";
            }
            current = current.getNext();
        }
         return "List: " + result;
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

        public Node getNext() {
            return next;
        }

        public String getData() {
            return data;
        }
    }

}


