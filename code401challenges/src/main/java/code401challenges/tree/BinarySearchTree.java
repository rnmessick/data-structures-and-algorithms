package code401challenges.tree;

public class BinarySearchTree extends Tree<Integer> {

    public BinarySearchTree() {
        super();
    }

    public BinarySearchTree(Node<Integer> current) {

        super(current);
    }

    //https://www.baeldung.com/java-binary-tree
    public boolean contains(Integer value) {
        return containsHelper(this.root, value);
    }

    // search through for a value by comparing it to the value
    // in the current node, then continue in the left or right depending on the value
    private boolean containsHelper(Node<Integer> current, Integer numberToFind) {
        if (current == null) {
            return false;
        }
        if (numberToFind.equals(current.value)) {
            return true;
        }
        return numberToFind < current.value
                ? containsHelper(current.leftChild, numberToFind)
                : containsHelper(current.rightChild, numberToFind);
    }


    public void add(Integer numbertoAdd) {
        Node<Integer> newNode = new Node<>(numbertoAdd);
        if (this.root == null) {
            this.root = newNode;
        } else {
            addHelper(this.root, newNode);
        }
    }
    private void addHelper(Node<Integer> current, Node<Integer> numberToAdd) {

        if (numberToAdd.value < current.value) {
            //check if tree is empty, if so add new node
            if (current.leftChild == null) {
                current.leftChild = numberToAdd;
            } else {
                addHelper(current.leftChild, numberToAdd);
            }
        } else if (numberToAdd.value > current.value) {
            if (current.rightChild == null) {
                current.rightChild = numberToAdd;
            } else {
                addHelper(current.rightChild, numberToAdd);
            }
        }
    }
}