package Milica;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] nums = {50,75,3,80,1,10,7,11};

        System.out.println(Arrays.toString(nums));

        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        System.out.println("min value: " + nums[0]);
        System.out.println("max value: " + nums[nums.length-1]);
    }
}
