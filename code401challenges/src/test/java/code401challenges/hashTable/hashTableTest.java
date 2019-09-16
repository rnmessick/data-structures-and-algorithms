package code401challenges.hashTable;

import org.junit.Test;

import static org.junit.Assert.*;

public class hashTableTest {

    @Test
    public void testHashTable_instantiateTable() {
        HashTable<String, String> ht = new HashTable<>();
        assertEquals("HashTable should be empty", 0, ht.size());
    }
    @Test
    public void testHashTable_addKeyValuePair() {
        HashTable<String, String> ht = new HashTable<>();
        ht.add("Steve", "Husband");
        ht.add("Baldr", "Dog");
        ht.add("Susan", "Best Friend");
        assertEquals("size of list is 3", 3, ht.size());
        ht.add("Robin", "Sister");
        ht.add("Eric", "Nephew");
        assertEquals("size of list is 5", 5, ht.size());
    }

    @Test
    public void testHashTable_searchForKeyAndGetValue() {
        HashTable<String, String> ht = new HashTable<>();
        ht.add("Robin", "Sister");
        ht.add("Eric", "Nephew");
        assertEquals("Value should print out as sister", "Sister", ht.get("Robin"));
    }
    @Test
    public void testHashTable_searchForKeyAndGetNull() {
        HashTable<String, String> ht = new HashTable<>();
        ht.add("Robin", "Sister");
        ht.add("Eric", "Nephew");
        assertEquals("Value should print out as null", null, ht.get("Sam"));
    }

    @Test
    public void testHashTable_handleCollision() {
        HashTable<String, String> ht = new HashTable<>();
        ht.add("Steve", "Husband");
        ht.add("Baldr", "Dog");
        ht.add("Susan", "Best Friend");
        ht.add("Robin", "Sister");
        ht.add("Eric", "Nephew");

        //capacity is 10 so after adding the next three k/v pairs, we should activate the overloader
        ht.add("Willow", "Cat");
        ht.add("Desi", "Niece");
        ht.add("Sam", "Nephew");
        assertEquals("Capacity, called numBuckets should be 20", 20, ht.numBuckets);
    }

    @Test
    public void testHashTable_handleCollisionThenRetriveValue() {
        HashTable<String, String> ht = new HashTable<>();
        ht.add("Steve", "Husband");
        ht.add("Baldr", "Dog");
        ht.add("Susan", "Best Friend");
        ht.add("Robin", "Sister");
        ht.add("Eric", "Nephew");
        //capacity is 10 so after adding the next three k/v pairs, we should activate the overloader
        ht.add("Willow", "Cat");
        ht.add("Desi", "Niece");
        ht.add("Sam", "Nephew");
        assertEquals("Should be able to retrive one the value of the key after the overloader has been activated", "Niece", ht.get("Desi"));

    }
 }
