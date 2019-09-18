//package code401challenges.tree;
//
//public class BinarySearchTree extends Tree<Integer> {
//    public BinarySearchTree() {
//        super();
//    }
//
//    public BinarySearchTree(int firstValue) {
//
//        super(new Node<>(firstValue, null, null));
//    }
//
//    //https://www.baeldung.com/java-binary-tree
//    public boolean contains(int value) {
//        return containsHelper(root, value);
//    }
//    // search through for a value by comparing it to the value
//    // in the current node, then continue in the left or right depending on the value
//    private <T> boolean containsHelper(Node current, T numberToFind) {
//        if (current == null) {
//            return false;
//        }
//        if (numberToFind == current.value) {
//            return true;
//        }
//        return false;
//    }
//
//
//    public <T> void add(T numberToAdd) {
//
//        this.root = addHelper(this.root, (Integer) numberToAdd);
//    }
//
//    public <T> Node<Integer> addHelper(Node<T> current, int numberToAdd) {
//        //check if tree is empty, if so add new node
//        if (current == null) {
//            current = (Node<T>) new Node<>(numberToAdd, null, null);
//            return (Node<Integer>) current;
//        }
//
//        if (numberToAdd < current.value) {
//            current.leftChild = addHelper(current.leftChild, numberToAdd);
//        } else if (numberToAdd > current.value) {
//            current.rightChild = addHelper(current.rightChild, numberToAdd);
//            //value already exists
//        }
//        return (Node<Integer>) current;
//    }
//
//}
