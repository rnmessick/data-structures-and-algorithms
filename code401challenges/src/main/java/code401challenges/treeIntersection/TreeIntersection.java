package code401challenges.treeIntersection;

import code401challenges.hashTable.HashTable;
import code401challenges.tree.Node;
import code401challenges.tree.Tree;

import java.util.ArrayList;
import java.util.List;

public class TreeIntersection<T> {
    public static List<String> treeIntersections(Tree btOne, Tree btTwo) {
        HashTable<String, Boolean> hashTable = new HashTable<>(10);

        ArrayList treeOneArr = btOne.inOrder();
        ArrayList treeTwoArr = btTwo.inOrder();

        ArrayList twinNodesArray= new ArrayList<>();

        for (Object key : treeOneArr) {
            hashTable.add(String.valueOf(key), false);
        }

        for (Object key : treeTwoArr) {
            if (hashTable.contains(String.valueOf(key)) ){
                hashTable.add(String.valueOf(key), true);
                twinNodesArray.add(String.valueOf(key));
            }

        }

        return twinNodesArray;
    }

}
