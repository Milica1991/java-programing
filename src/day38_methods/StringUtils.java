package day38_methods;

import java.util.Locale;

public class StringUtils {
    public static void main(String[] args) {
        isNullOrEmpty("hello");
        System.out.println("isNullOrEmpty(\"hello\") = " + isNullOrEmpty("hello"));
        String word = null;
       // System.out.println(word.toUpperCase());
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));
        word ="";
        System.out.println("isNullOrEmpty(word) = " + isNullOrEmpty(word));

        System.out.println("civic = " + StringUtils.isPalindrome("civic"));
        System.out.println("isPalidrome(kayak) = " + StringUtils.isPalindrome("kayak"));

        String word1 = "java";
        String revWord = StringUtils.reverse(word1);
        System.out.println("word1 = " + word1);
        System.out.println("revWord = " + revWord);

    }
    public static boolean isNullOrEmpty(String str){
        //return (str == null || str.isEmpty());
        if (str == null || str.isEmpty()) {
            return  true;

        }
        return false;


    } public static boolean isPalindrome(String str ){
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }
        }
        return true;
    }
    public static String reverse (String str) {
        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);

        }
        return reverse;
    }
}
