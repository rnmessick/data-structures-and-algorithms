package code401challenges.hashTable;

public class RepeatedWord {
    public static void repeatedWord(String bookString) {
        HashTable<String, Integer> hashTable = new HashTable<>();
        //convert to lower case
        bookString = bookString.toLowerCase();
        //split the string into words
        String[] words = bookString.split(" ");

        for (String key : words) {


            Integer value = hashTable.get(key);
            if (value == null) {
                value = 0;
                hashTable.add(key, value);
            } else {
                Integer maxValue = Integer.MIN_VALUE;
                String maxKey = key;
                value++;
                hashTable.add(key, value);
                if (value > maxValue) {

                }
            }


        }
//    Hashtable<String, Integer> hashtable = new Hashtable<String, Integer>();
//    String[] splitInput = input.split(" ");
//for(String inputToken : splitInput) {
//        Integer val = hashtable.get(inputToken);
//        if(val == null) {
//            val = new Integer(0);
//        }
//        ++val;
//        hashtable.put(inputToken, val);
//    }
//    public String[] stringSplitter(String string) {
//
//        String[] arrSplit = string.split(", ");
//        for (int i = 0; i < arrSplit.length; i++) {
//            System.out.println(arrSplit[i]);
//        }
//        return arrSplit;
//    }
    }
}


