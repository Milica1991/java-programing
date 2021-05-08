package day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num =15;
        if (num < 1  || num > 10) {
            System.out.println("error invalid input" );
            return;
        }

            for(int i = 1; i<= 10; i++) {
            System.out.println(num + " x "+ i + " = " + (num * i));
        }
       // System.out.println(num +" x "+ 1 + " = "+(num*1));


    }
}