package Milica;

import java.util.Arrays;

public class QuizArrays {
    public static void main(String[] args) {
        char [] array = {'D', 'C', 'B', 'A'};
        Arrays.sort(array);
        for (char each : array) {
            System.out.println(each + " ");
            if (each == 'D') {
                continue;
            }
        }

        int n = 0;
        String [] days = {"sun", "mon", "wed", "sat"};
        for(int i = 0; i< days.length; i++){
            switch (days[i]) {
                case"sat":
                case"sun":
                    n-= 1;
                    break;
                case"mon":
                    n++;
                case"wed":
                    n+=2;
            }
        }
        System.out.println(n);


        int[] num1 = new int[3]; //000?
        int[] num2 = {1,2,3,4};
        num1 = num2;
        for (int i = 0; i < num1.length; i ++){
            System.out.print(num1[i]);
        }


        int [] intArr = {15,30,45,60,75};
        intArr[2] = intArr[4];
        intArr[4] = 90;
        System.out.println(Arrays.toString(intArr));


    }
}
