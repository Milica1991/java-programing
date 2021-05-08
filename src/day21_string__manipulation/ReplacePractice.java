package day21_string__manipulation;

import java.util.Locale;

public class ReplacePractice {
    public static void main(String[] args) {
        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("hub","lab"));
        System.out.println("word = " + word);

        word = word.replace("hub","lab");
        System.out.println("word = " + word); //gitlab

        //I->o  a->i
        System.out.println(word.replace("i","o").replace("a","i"));

        String sentence = "java is fun";
        String withNoSpace = sentence.replace(" ","");
        System.out.println("withNoSpace = " + withNoSpace);
        sentence = sentence.replace("java", "selenium").replace("fun", "a lot of fun").replace(" ", "");
        System.out.println("sentence = " + sentence);

        String result = ("1-48 of over 4,000 result for java book");
        result = result.replace("1-48 of over","")
                .replace(",","")
                .replace(" result for java book","");
        System.out.println("result = " + result);

        int count =Integer.parseInt(result);
        count++;
        if (count > 0) {
            System.out.println("Search success" );
        }
    }
}
