package code401challenges.tree.treeIntersection;

import code401challenges.stacksandqueues.Stack;

public class TreeIntersection {

    static class Node {
        int key;
        Node left, right;
    }

    static Node newNode(int element) {
        Node temp = new Node();
        temp.key = element;
        temp.left = null;
        temp.right = null;
        return temp;
    }

    static void treeIntersections(Node root1, Node root2) {
        Stack<Node> stack1 = new Stack<>();
        Stack<Node> s1 = new Stack<>();
        Stack<Node> s2 = new Stack<>();

        while (true) {

            //push Nodes of first tree in stack s1
            if(root1 != null) {
                s1.push(root1);
                root1 = root1.left;

            }

            //push the Nodes of second tree into stack2
            else if(root2 != null) {
                s2.push(root2);
                root2 = root2.left;
            }

//            both root1 and root2 are null
            else if (!s1.isEmpty() && !s2.isEmpty()) {
                root1 = s1.peek();
                root2 = s2.peek();
            }

            if (root1.key == root2.key) {
                System.out.println(root1.key + "");
                s1.pop();
                s2.pop();

                //move to the inorder successor
                root1 = root1.right;
                root2 = root2.right;
            }
            else if (root1.key < root2.key) {
                s1.pop();
                root1 = root1.right;

                root2 = null;
            }
            else if (root1.key > root2.key) {
                s2.pop();
                root2 = root2.right;
                root1 = null;
            }
        }

    }
}
