package OfficeHours._03_02_2021;

import java.util.Arrays;
import java.util.Scanner;

public class Practice04_13_2021 {
    public static void main(String[] args) {
        //get dynamic values for the user

        Scanner input = new Scanner(System.in);
        System.out.println("How many words will you enter:");
        String [] words = new String[input.nextInt()];
        input.nextLine();

        for (int i = 0; i < words.length; i++) {
            System.out.println("Enter word: " + (i+1));
            words[i] = input.nextLine();

        }
        System.out.println(Arrays.toString(words));
        String smallest,largest;
        String [] smallAndlarge = new String[2];// null null
        //0 -> smallest
        //1 -> largest

        for (String eachWord: words){
            if (eachWord.length() > smallAndlarge[0].length()){
                smallAndlarge[0] = eachWord;
            }

        }
        System.out.println("Smallest element: "+ smallAndlarge[0]);
        System.out.println("Largest element: "+ smallAndlarge[1]);
        System.out.println(Arrays.toString(smallAndlarge));
    }
}
