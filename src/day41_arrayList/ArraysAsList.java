package day41_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 1, 34, 54, 654);
        System.out.println("nums =  " + nums);
        List<Integer> numsList = new ArrayList<>(Arrays.asList(4, 2, 4, 23, 5344, 100));
        numsList.add(33);
        numsList.add(56);
        System.out.println("numsList = " + numsList);
        numsList.remove(0); //remuve index
        numsList.remove(new Integer(23));// remuve number
        System.out.println("numsList = " + numsList);
        /**
         * List String drinksWithCoffeine ->
         * int coffeineAmount = 0
         */
        List<String> drinksWithCaffeine = new ArrayList<>(Arrays.asList("coffee", "tea", "monster",
                "red bull", "coke", "pepsi", "mdew","kambucha","celsius"));
        System.out.println(drinksWithCaffeine);

        int caffeineAmount = 0;
        for (String drink : drinksWithCaffeine) {
            if (drink.equals("monster") || drink.equals("red bull") || drink.equals("celsius")){
                caffeineAmount = 150;
                System.out.println(drink+" --> " +caffeineAmount);
            }else if (drink.equals("coffie") || drink.equals("kambucha")){
                caffeineAmount = 122;
                System.out.println(drink+" --> " +caffeineAmount);
            }else if (drink.equals("tea") || drink.equals("coke") || drink.equals("pepsi") || drink.equals("mdew")){
                caffeineAmount = 35;
                System.out.println(drink+" --> " +caffeineAmount);
            }
        }
        System.out.println();
        for (String drink : drinksWithCaffeine) {
            switch (drink) {
                case "monster" : case "red bull" : case "celsius":
                    caffeineAmount = 150;
                    System.out.println(drink+" --> " +caffeineAmount);
                    break;
                case "coffie" : case "kambucha" :
                    caffeineAmount = 122;
                    System.out.println(drink+" --> " +caffeineAmount);
                    break;
                case "tea" : case "coke" : case "pepsi" : case "mdew":
                    caffeineAmount = 35;
                    System.out.println(drink+" --> " +caffeineAmount);
                    break;
            }
        }
        drinksWithCaffeine.forEach(drink -> System.out.println(drink));

        drinksWithCaffeine.forEach(drink -> {
            System.out.println("This is for Each block");
            System.out.println("drink = " + drink);
        });

    }
}
