package code401challenges.tree.treeIntersection;

import code401challenges.hashTable.HashTable;
import code401challenges.tree.Tree;

import java.util.ArrayList;

public class TreeIntersection {


    public static ArrayList<String> treeIntersections(Tree<String> tree1, Tree<String> tree2) {
        HashTable<String, Boolean> hashtable = new HashTable<>();

        ArrayList<String> treeOneArr = tree1.inOrder();
        ArrayList<String> treeTwoArr = tree2.inOrder();

        ArrayList<String> finalArr = new ArrayList<>();

        //for loop to find and hash the nodes in tree1
        for (String key : treeOneArr) {
            hashtable.add(key, false);
        }
        //for loop to find and hash the nodes in tree2
        for (String key : treeTwoArr) {
            //check for duplicates
            if (hashtable.contains(key)) {
                hashtable.add(key, true);
                //the nw e add the duplicates to the arraylist
                finalArr.add(key);
            }

        }
        return finalArr;

    }
}
