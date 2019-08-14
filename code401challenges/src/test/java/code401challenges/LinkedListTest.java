package code401challenges;

import linkedLists.LinkedList;
import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void testNewEmptyLinkedList() {
        LinkedList newList = new LinkedList();
        assertTrue("linked list should be empty", newList.isEmpty());
        assertEquals("Length should be zero",0, newList.length());
    }

    // Can properly insert into the linked list
    @Test
    public void testLinkedList_hasContent() {
        LinkedList<String> newList = new LinkedList<>();
        newList.insert("Baldr is my doggo");
        assertFalse("linked list should have content", newList.isEmpty());
        assertEquals("Length should be 1 long",1, newList.length());
    }

    // Can properly insert multiple nodes into the linked list
    @Test
    public void testLinkedList_addMultipleNodes() {
        LinkedList<String> newList = new LinkedList<>();
        newList.insert("A");
        newList.insert("B");
        newList.insert("C");
        assertEquals("Length should be 3 long", 3, newList.length());
    }

    //  Will return true when finding a value within the linked list that exist
    @Test
    public  void testLinkedList_IncludesTrue() {
        LinkedList<String> newList = new LinkedList<String>();
        newList.insert("A");
        newList.insert("B");

        assertTrue("The list should return true if the value exists in the list", newList.includes("B"));
    }

    // Will return false when searching for a value in the linked list that does not exist
    @Test
    public void testLinkedList_IncludesFalse() {
        LinkedList<String> newList = new LinkedList<>();
        newList.insert("A");
        newList.insert("B");

        assertFalse("The list should return false if the value does not exist in the list", newList.includes("C"));
    }

    //Can properly return a collection of all the values that exist in the linked list
    @Test
    public void testLinkedList_printFullList() {
        LinkedList<String> newList = new LinkedList<>();
        newList.insert("A");
        newList.insert("B");
        newList.insert("C");

        assertEquals("List should print as Head, C, B, A", "List: HEAD->C->B->A->null", newList.toString());
    }

    @Test
    public void testLinkedList_append() {
        LinkedList<String> newList = new LinkedList<>();
        newList.insert("A");
        newList.append("D");

        assertEquals("Append D to end", "List: HEAD->A->D->null", newList.toString());
    }
//
    @Test
    public void testLinkedList_insertBefore() {
        LinkedList<String> newList = new LinkedList<>();
        newList.insert("A");
        newList.insert("B");
        newList.insert("C");
        newList.insertBefore("B", "D");
//        System.out.println("Insert Before " + newList);
        assertEquals("Insert D before B", "List: HEAD->C->D->B->A->null", newList.toString());
    }

    @Test
    public void testLinkedList_insertAfter() {
        LinkedList<String> newList = new LinkedList<>();
        newList.insert("A");
        newList.insert("B");
        newList.insert("C");
        newList.insertAfter("B", "D");
//        System.out.println("Insert After " + newList);
        assertEquals("Insert D After B", "List: HEAD->C->B->D->A->null", newList.toString());
    }

}


