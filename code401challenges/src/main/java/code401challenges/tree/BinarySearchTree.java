package code401challenges.tree;

public class BinarySearchTree extends Tree<Integer> {
    public BinarySearchTree() {
        super();
    }

    public BinarySearchTree(int firstValue) {

        super(new Node(firstValue, null, null));
    }

    //https://www.baeldung.com/java-binary-tree
    public boolean contains(int value) {
        return containsHelper(root, value);
    }
    // search through for a value by comparing it to the value
    // in the current node, then continue in the left or right depending on the value
    private boolean containsHelper(Node<Integer> current, int numberToFind) {
        if (current == null) {
            return false;
        }
        if (numberToFind == current.value) {
            return true;
        }
        return numberToFind < current.value
                ? containsHelper(current.leftChild, numberToFind)
                : containsHelper(current.rightChild, numberToFind);
    }


    public void add(int numbertoAdd) {

        this.root = addHelper(this.root, numbertoAdd);
    }

    public Node<Integer> addHelper(Node<Integer> current, int numberToAdd) {
        //check if tree is empty, if so add new node
        if (current == null) {
            current = new Node(numberToAdd, null, null);
            return current;
        }

        if (numberToAdd < current.value) {
            current.leftChild = addHelper(current.leftChild, numberToAdd);
        } else if (numberToAdd > current.value) {
            current.rightChild = addHelper(current.rightChild, numberToAdd);
            //value already exists
        }
        return current;
    }

}
