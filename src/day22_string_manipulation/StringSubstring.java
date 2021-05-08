package day22_string_manipulation;

public class StringSubstring {
    public static void main(String[] args) {
        String word = "java is fun";
        /**
         * 1) word.sustring(startIndex, endIndex)
         * endIndex is not included
         */
        System.out.println(word.substring(0, 3));
        System.out.println(word.substring(0, 7));
        System.out.println(word.substring(5, 7));
        System.out.println(word.substring(0, 7));
        System.out.println(word.substring(8, 11));
        /**
         * 2) substring(strtIndex) - it will read from start until end
         */
        System.out.println(word.substring(8));
        System.out.println(word.substring(5));
    }
}
