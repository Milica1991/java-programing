package day23_string_manipulation_while_loop;

import java.util.Locale;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word = "woo den spo on";
        System.out.println(word.toUpperCase().toLowerCase().length());
        //remove space first and print evrithing uppercase

        System.out.println(word.replace(" ","").toUpperCase());

        String city = "BEOGRAD";
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1).toLowerCase());
        String capitalized = city.substring(0,1).toLowerCase()+ city.substring(1).toLowerCase();
        System.out.println("capitalized = " + capitalized);

        //Markov primer univerzalni kod
        String text = "los angeles";
        int emptySpace = text.indexOf(" ");
        System.out.println(text.substring(0,1).toUpperCase() + text.substring(1,emptySpace) +
                text.substring(emptySpace,emptySpace+1) + text.substring(emptySpace+1,emptySpace+2).toUpperCase() +
                text.substring(emptySpace+3));
    }
}