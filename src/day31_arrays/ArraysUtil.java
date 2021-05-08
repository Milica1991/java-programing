package day31_arrays;
import  java.util.Arrays;
public class ArraysUtil {
    public static void main(String[] args) {
        int[] nums = {100, 5, 1, 7, 0, -4, 44, 33};

        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("min value: " + nums[0]);
        System.out.println("max value: " + nums[nums.length-1]);
        //Arrays.sort(nums, collections.reverseOrder());
        String[] words= {"java", "C#", "C++", "Kotlin", "Python", "Ruby", "Assembly"};
        System.out.println(Arrays.toString(words));
        System.out.println("["+String.join(", ", words)+"]");

        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
    }
}
