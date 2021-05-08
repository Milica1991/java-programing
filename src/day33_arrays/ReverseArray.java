package day33_arrays;
import java.sql.SQLOutput;
import  java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        //swap those using additional variable
       //num2 = num1; 10
        //num1 = num2;  10
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
                    //0  1 2  3
        int[] nums = {5,10,4,100};
        System.out.println("before swap: " + Arrays.toString(nums));

        temp = nums[0]; //5
        nums[0] = nums[3]; //100
        nums[3] = temp; //5
        System.out.println("After 1st and last swap: " + Arrays.toString(nums));
        //             0   1   2  3
        int[] nums2 = {5, 10, 4, 100};

        System.out.println("Before: " + Arrays.toString(nums2 ));
           //                  2
        for (int i = 0; i < nums2.length/2; i++) {
            int temp2 = nums2[i];
            nums2[i] = nums2[nums2.length - 1 - i];
            nums2[nums2.length - 1 - i]= temp2;
        }
        System.out.println("After: " + Arrays.toString(nums2));
               //            0      1      2      3      4
        String[] words = {"java", "html", "js", "ruby", "css"};
        System.out.println("Before reverse words = " + Arrays.toString(words));
    //      i -> 0, j -> 4                        2
        for (int i = 0, j = words.length-1; i < words.length/2; i++, j--){
            String tempWord = words[i];
            words[i] = words[j];
            words[j] = tempWord;
        }
        System.out.println("words after reverse = " + Arrays.toString(words));
    }
}
