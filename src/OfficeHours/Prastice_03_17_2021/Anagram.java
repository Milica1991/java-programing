package OfficeHours.Prastice_03_17_2021;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    /*[Anagram]

Create a method that will accept two Strings. Check if the two Strings are anagram of each other. If they are anagram return true otherwise return false.

Anagram means the characters of the words are the same, but rearranged in different orders

For example:
    listen and silent are anagram because the characters in 'listen' can be rearranged to make 'silent'

     */
    public static void main(String[] args) {
        System.out.println(isAnsgram("listen", "silent"));

    }
    public static boolean isAnsgram (String one, String two){
        if (one.length() != two.length()){
            return false;
        }
        one = one.toLowerCase();
        one = two.toLowerCase();

        int [] count = new int [26];

        for (int i = 0; i < one.length(); i++){

            char letterFromOne = one.charAt(i);
            char letterFromTwo = two.charAt(i);

            count[letterFromOne - 97 ] = count[letterFromOne - 97] + 1;
            count[letterFromTwo - 97] = count[letterFromTwo - 97 ] - 1;

        }
        return Arrays.equals(count, new int[26]);


    }
}
