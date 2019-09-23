package code401challenges.hashTable.leftJoin;

import java.util.Hashtable;

public class LeftJoin {

    public static void leftJoin(Hashtable ht1, Hashtable ht2) {
        //    The first parameter is a hashmap that has word strings as keys, and a synonym of the key as values.
//    The second parameter is a hashmap that has word strings as keys, and antonyms of the key as values.
        Hashtable<String, String> synonymTable = new Hashtable<>();
        Hashtable<String, String> antonymTable = new Hashtable<>();

        antonymTable.forEach(
                (key, value) -> synonymTable.merge(key, value, (v1, v2) ->
                        v1.equalsIgnoreCase(v2) ? v1 : v1 + "," + v2 ) );

        }

    }


