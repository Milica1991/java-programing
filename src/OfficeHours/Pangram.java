package OfficeHours;

import java.util.Arrays;
import java.util.Locale;

public class Pangram {
    public static void main(String[] args) {
      String s = "A quick brown fox jumps over a lazy dog";
  //      char [] a = s.replace(" ", "").toLowerCase().toCharArray();
   //     Arrays.sort(a);
   //     System.out.println(Arrays.toString(a));

        System.out.println(isPangram(s));

    }
    public static boolean isPangram (String str) {
       str = str.toLowerCase();

        String alp = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 'a'; i < str.length(); i++) {

           if (Character.isLetter(str.charAt(i))){
               alp = alp.replace("" + str.charAt(i), "");
               System.out.println(str.charAt(i) + " " + alp);
           }
        }
        return alp.isEmpty();

    }

}

