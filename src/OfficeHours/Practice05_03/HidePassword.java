package OfficeHours.Practice05_03;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    public static void main(String[] args) {

        String[]password = {"one", "apple", "hold"};
        ArrayList<String> hiddenPassword = new ArrayList<>();

        for(String each : password) {
            hiddenPassword.add(convertToStars(each));

        }
        System.out.println("Original: " + Arrays.toString(password));
        System.out.println(hiddenPassword);
    }
    //helper method is method that does some action,and its caled somewhere else
    public static String convertToStars(String str){
        String stars = "";
        for (int i = 0; i < str.length(); i++){
            stars += "*";
        }
        return stars;
    }
}
