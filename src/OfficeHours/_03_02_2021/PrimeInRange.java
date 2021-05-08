package OfficeHours._03_02_2021;

public class PrimeInRange {
    public static void main(String[] args) {
        /*
        [Iq] prime in rage
        given number.Print out all the prime number from 2 to that number A
        EX:
        input 50
        output 2,3,5,7,11,13,17,19,23,29,31,41,43,47
         */

        int number = 5;
        boolean isPrime = true;
        //50/2 50/3 50/4

        for (int i = 2; i < number; i++){
            if (number%i == 0) {
                isPrime = false;
            }
        }
        System.out.println(isPrime);
    }
}
