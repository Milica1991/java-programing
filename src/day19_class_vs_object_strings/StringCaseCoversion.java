package day19_class_vs_object_strings;

public class StringCaseCoversion {
    public static void main(String[] args) {
        String word = "CyberTek";
        String sentence = "1234 Java IS FUN";

        System.out.println(word);
        System.out.println(word.toLowerCase());
        System.out.println("JAVA".toLowerCase());
        System.out.println(sentence.toLowerCase());

        word.toLowerCase();
        System.out.println(word);

        String wordInLcase = word.toLowerCase();
        System.out.println("wordInLcase = " + wordInLcase);

        word = word.toLowerCase();
        System.out.println("word = " + word);

        String company = "Amazon";
        System.out.println(company.toUpperCase());
        System.out.println("company in uppercase -" + company.toUpperCase());
        System.out.println("java".toUpperCase());


        //change company Amazon to AMAZON

        System.out.println("company = " + company);
        company = company.toUpperCase();
        System.out.println("company = " + company);
    }
}