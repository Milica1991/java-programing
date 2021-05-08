package day07_aritmetic_operatos_casting;

public class OperatorPrecedence {
    public static void main(String[] args) {
        System.out.println(10 + 5);
        System.out.println(10 - 5 + 3);
        System.out.println(10 - (5 + 3));

        System.out.println(2 * 3); //6
        System.out.println(2 * 3 / 3); //2
        System.out.println(20 / (2*2)); //20 / 4 ->5
        //System.out.println(10 / 0 ); --> Error

        System.out.println(2 + 5 * 3); //17
        System.out.println((2 + 5) * 3); // 20
    }
}
