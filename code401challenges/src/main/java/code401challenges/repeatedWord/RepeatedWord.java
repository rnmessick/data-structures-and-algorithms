package code401challenges.repeatedWord;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class RepeatedWord {

    public RepeatedWord(String string) throws IOException {
        int count;

        //convert to lower case
        string = string.toLowerCase();

        //split the string into words
        String words[] = stringSplitter(string);

        for( int i = 0; i < words.length; i++) {
            count = 1;

            for ( int j = i + 1; j < words.length; j++) {
                if( words[i].equals(words[j])) {
                    count++;

                    words[j] = "0";
                }
            }
            if(count > 1 && words[i] != "0") {
                System.out.println(words[i]);
            }
        }


    }

    public String[] stringSplitter(String string) throws IOException {
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

        return words;
    }

}
