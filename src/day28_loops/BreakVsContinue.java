package day28_loops;

public class BreakVsContinue {
    public static void main(String[] args) {
        //break statment
        for (int n = 1; n <= 5; n++){

        for (int i = 1; i <= 5; i++) {
            if (i == 2 || i == 4) {
                continue;
            }
            System.out.print(i);
        }
        }
    }
}
