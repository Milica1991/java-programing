package OfficeHours.Practice_03_15;

public class OperatorAnalyze {
    public static void main(String[] args) {

        /*
        Analyze the following wiothout intellij. Calculate the output step by step
         */

        int a=5; //a = 5
        int b = a++ + a-- + a * 2 + a + ++a;
        //       5 +   6  + 5 * 2 + 5 + 6:
        //       5 +   6  + 10 + 5 + 6:
        // 11 + 10 + 5 + 6
        //21+5 + 6
        //26+6
        //b= 32
        System.out.println("a-  " + a);
        System.out.println("b- " + b);

        int a1 = 200; //a = 200/201/199
        int b2 = -a++ + - --a * a-- % 2 + a;
        //    =  -200 + - 200 * 200 % 2 + 199;
        //    = -200 + - 40000 % 2 +0199;
        //    = - 200 + 0 + 199
        //    = -200 + 199;
        //    = -1
        System.out.println("a1: " + a1);
        System.out.println("b2: " + b2);
    }
}
