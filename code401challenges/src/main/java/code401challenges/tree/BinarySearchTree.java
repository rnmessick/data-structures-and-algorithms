package code401challenges.tree;

public class BinarySearchTree extends Tree {
    Node root;

    public BinarySearchTree(Node root) {
        super(root);
    }

    //https://www.baeldung.com/java-binary-tree
    // search through for a value by comparing it to the value
    // in the current node, then continue in the left or right depending on the value
    private boolean containsHelper(Node current, int value) {
        if (current == null) {
            return false;
        }
        if (value == current.value) {
            return true;
        }
        return value < current.value
                ? containsHelper(current.leftChild, value)
                : containsHelper(current.rightChild, value);
    }

    public boolean contains(int value) {
        return containsHelper(root, value);
    }

    private Node addHelper(Node current, int value) {
        //check if tree is empty, if so add new node
        if (current == null) {
            current = new Node(value);
            return current;
        }

        if (value < current.value) {
            current.leftChild = addHelper(current.leftChild, value);
        } else if (value > current.value) {
            current.rightChild = addHelper(current.rightChild, value);
            //value already exists
        }
        return current;
    }


    public void add(int value) {
        root = addHelper(root, value);
    }

}
