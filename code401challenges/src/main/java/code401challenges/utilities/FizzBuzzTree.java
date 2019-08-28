package code401challenges.utilities;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;

public class FizzBuzzTree {

    public static Tree<Object> fizzBuzzTree(Tree<Object> tree) {
        //check if tree has a root
        fizzBuzzHelper(tree.root);
        return tree;
    }

    private static void fizzBuzzHelper(Node<Object> root) {
        if (root != null) {
            //refactoring while watching on front row
            if ((int) root.getValue() % 15 == 0) {
                root.setValue("FizzBuzz");
            } else if ((int) root.getValue() % 5 == 0) {
                root.setValue("Buzz");
            } else if ((int) root.getValue() % 3 == 0) {
                root.setValue("Fizz");
            }
            //check the left subtree
            fizzBuzzHelper(root.getLeftChild());
            //check the right subtree
            fizzBuzzHelper(root.getRightChild());
        }
    }
}
