package day42_arrayList;

import day41_arrayList.ArraysAsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueFromList {
    public static void main(String[] args) {
        //declare Intege5r arrayList with following numbers
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 4, 4, 1, 5, 6, 0, 6));
        System.out.println(nums);
        List<Integer> uniqueList = getUniqueIntegers(nums);
        System.out.println("\nuniqueList = " + uniqueList);


    }

    private static List<Integer> getUniqueIntegers(List<Integer> nums) {
        //new arraylist to store unique numbers
        List<Integer> uniqueList = new ArrayList<>();
        //loop through the list
        for (Integer num : nums) {
            //check if number appears only once in the list
            if (Collections.frequency(nums, num) == 1){
                //print that number
                System.out.println(num +" ");

                uniqueList.add(num);

            }
        }
        return uniqueList;
    }
}
