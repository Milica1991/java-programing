package OfficeHours._03_02_2021;

public class Palindrome {
    public static void main(String[] args) {
        String word = "civic";
        boolean isPalidrome = true;
        for (int i = 0; i < word.length()/2; i++){
            if (word.charAt(i) != word.charAt(word.length()-1-i)) {
                isPalidrome = false;
                break;

            }

        }
        System.out.println(isPalidrome);
    }
}
