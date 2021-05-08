package OfficeHours.Practice05_03;

import java.util.ArrayList;
import java.util.Arrays;

public class CountLetters {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "javascript", "java","word"));
        char targetLeter = 'a';

        int count = 0;

        for (String word : words){
            for (int i = 0; i< word.length(); i++) {
                if (word.charAt(i) == targetLeter){
                    count++;
                }
            }

        }
        System.out.println(targetLeter + " was found " + count);


    }
}
