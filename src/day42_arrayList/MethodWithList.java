package day42_arrayList;

import com.sun.org.apache.xerces.internal.xs.StringList;
import day41_arrayList.ArraysAsList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodWithList {
    public static void main(String[] args) {
        //declare String arrayList and add values
        List<String> words = new ArrayList<>();
        words.add("java"); words.add("html"); words.add("selenium");
        words.add("a"); words.add("input"); words.add("title");
        //pass the words list to printStrList method
        printStrList(words);

        printStrList(Arrays.asList("selects", "options", "br", "python", "sql", "api"));
        List<Integer> nums = Arrays.asList(23, 54, 54554, 234, 11, 5, 20);
        int sum = sumIntegerList(nums);
        System.out.println("sum = " + sum);
    }

        /**
         * methodName:printStrList
         * param:List of Strings
         * return:void
         * prints all values separated by space in same line
         */
        public static void printStrList (List<String> stringList){
            for (String str : stringList) {
                System.out.println(str + " ");
            }
            System.out.println();


    }
    /**
     * methodName: sumIntegerList
     * param: List of integers
     * returns int calculates sum of inters in the list then returns
     */
    public static int sumIntegerList(List<Integer> integerList) {
        int sum = 0;
        for (int i : integerList) {
            sum += i;
        }
        return sum;
    }
}
