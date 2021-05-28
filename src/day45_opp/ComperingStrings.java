package day45_opp;

public class ComperingStrings{
    public static void main(String[] args) {
        String word1 = "java";//in string pool
        String word2 = "java";// re-use from string pool
        String word3 = new String("java");//create in HEAP ,outside String pool
        String word4 = new String("java"); // create NEW object in HEAP,outside String pool

        System.out.println(word1 == word2); //true - point to same object in pool
        System.out.println(word1 == word3); //false - point to diferent object  in HEAP and POOL
        System.out.println(word3 == word4); //false point in different object in HEAP

        System.out.println(word1.equals(word2)); // true
        System.out.println(word1.equals(word3)); // true
        System.out.println(word3.equals(word4)); // true
    }
}
