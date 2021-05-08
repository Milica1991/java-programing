package day29_nestedloop_arrays;

public class MultiplicationTable {
    public static void main(String[] args) {
        for (int outer = 1; outer<= 10; outer++) {
            for (int inner = 1; inner <= 10; inner++){ //columns
                System.out.print(outer * inner+ "\t"); //rows

            }
            System.out.println();
        }
    }
}
