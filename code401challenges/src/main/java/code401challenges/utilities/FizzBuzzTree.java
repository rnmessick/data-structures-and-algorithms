package code401challenges.utilities;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;

public class FizzBuzzTree {

    public FizzBuzzTree(Node<Object> nodes) {
    }

    public static Tree<Object> fizzBuzzTree(Tree<Object> tree) {
        //check if tree has a root
        if(tree.root.getValue() == null) {
            throw new IllegalArgumentException("Root is null");
        }
        else {
            fizzBuzzHelper((Node<Object>) tree.root.getValue());
        }
        return tree;
    }

    private static void fizzBuzzHelper(Node<Object> node) {
        if(node.getLeftChild() != null) {
            fizzBuzzHelper((node.getLeftChild()));
        }
        if(node.getRightChild() != null) {
            fizzBuzzHelper((node.getRightChild()));
        }
        String numberCheck = (String) node.getValue();

        // I chose 15 rather than checking for the 3 && 5 because I felt like it is more efficient. It worked for me when we did fizzbuzz in Javascript
        if (Integer.parseInt(numberCheck) % 15 == 0) {
            node.setValue("FizzBuzz");
        }
        else if (Integer.parseInt(numberCheck) % 3 == 0) {
            node.setValue("Fizz");
        }
        else if (Integer.parseInt(numberCheck) % 5 == 0) {
            node.setValue("Buzz");
        }
    }

}
