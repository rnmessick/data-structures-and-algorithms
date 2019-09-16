package code401challenges.repeatedWord;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RepeatedWord {

    public static void RepeatedWord(String string) {
        int count;

        //convert to lower case
        string = string.toLowerCase();

        //split the string into words


    }

    public void stringSplitter(String string) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        string = br.readLine();

        ArrayList<Integer> integerArrList = new ArrayList<>();
        ArrayList<String> resultList = new ArrayList<>();

        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) == ' ') {
                integerArrList.add(i);
            }

        }
        integerArrList.add(integerArrList.size(), string.length());
        String[] words = new String[integerArrList.size()];
        for ( int j = 0; j <= words.length-2; j++) {
            resultList.add(string.substring(integerArrList.get(j), integerArrList.get(j + 1)).trim());
            System.out.println(resultList);
        }

    }

}
