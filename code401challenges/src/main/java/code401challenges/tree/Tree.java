package code401challenges.tree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Tree<T> {

    Node<T> root;


    public Tree() {
        this.root = null;
    }

    public Tree(Node root) {
        this.root = root;
    }

    public ArrayList<T> preOrder() {
        return preOrderHelper(this.root, new ArrayList<>());
    }

    private ArrayList<T> preOrderHelper(Node<T> current, ArrayList<T> arrList) {
        // root first
        arrList.add(current.value);
        if (current.leftChild != null) {
            preOrderHelper(current.leftChild, arrList);
        }
        if (current.rightChild != null) {
            preOrderHelper(current.rightChild, arrList);
        }
        return arrList;
    }

    public ArrayList<T> inOrder() {
        return inOrderHelper(this.root, new ArrayList<>());
    }

    private ArrayList<T> inOrderHelper(Node<T> current, ArrayList<T> arrList) {

        if (current.leftChild != null) {
            inOrderHelper(current.leftChild, arrList);
        }

        arrList.add(current.value);

        if (current.rightChild != null) {
            inOrderHelper(current.rightChild, arrList);
        }
        return arrList;
    }

    public ArrayList<T> postOrder() {
        return postOrderHelper(this.root, new ArrayList<>());
    }

    private ArrayList<T> postOrderHelper(Node<T> current, ArrayList<T> arrList) {

        if (current.leftChild != null) {
            postOrderHelper(current.leftChild, arrList);
        }
        if (current.rightChild != null) {
            postOrderHelper(current.rightChild, arrList);
        }
        arrList.add(current.value);

        return arrList;
    }

    public static ArrayList breadthFirstTraversal(Tree bTree) {
        if (bTree.root == null) {
            return null;
        }
        ArrayList arrList = new ArrayList();
        Queue<Node> nodes = new LinkedList<>();
        nodes.add(bTree.root);

        while (!nodes.isEmpty()) {
            Node frontNode = nodes.remove();
            arrList.add(frontNode.value);
            if (frontNode.leftChild != null) {
                nodes.add(frontNode.leftChild);
            }
            if (frontNode.rightChild != null) {
                nodes.add(frontNode.rightChild);

            }
        }

        return arrList;
    }

    public Integer findMaxValue() {
        //where is the max?
        //solving recursively
        if (this.root == null) {
            return null;
        } else {
            return findMaxValueHelper(this.root, (Integer) this.root.value);
        }
    }

    private Integer findMaxValueHelper(Node<T> treeNode, Integer maxResult) {

    //find the max from those three spots
        if(treeNode !=null) {
            if ((Integer) treeNode.value > maxResult) {
                maxResult = (Integer) treeNode.value;
            }
            maxResult = findMaxValueHelper(treeNode.leftChild, maxResult);
            maxResult = findMaxValueHelper(treeNode.rightChild, maxResult);
        }
        return maxResult;
    }

    public Node<T> getRoot() {
        return this.root;
    }

    @Override
    public String toString() {
        return this.root.toString();
    }
}
