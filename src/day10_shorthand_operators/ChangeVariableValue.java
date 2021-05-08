package day10_shorthand_operators;

public class ChangeVariableValue {
    public static void main(String[] args) {
        int count = 3;
        System.out.println("count = " + count);
        //add two more yo count
        count = count + 2;
        System.out.println("count = " + count);

        int apples = 5;
        System.out.println("apples = " + apples);
        apples = apples + 10;
        System.out.println("apples = " + apples);
        apples = apples - 3;
        System.out.println("apples = " + apples);

        int pizzaSlices = 8;
        System.out.println("pizzaSlices = " + pizzaSlices);
        pizzaSlices = pizzaSlices / 2;
        System.out.println("pizzaSlices = " + pizzaSlices);
        //get another whole small pizza just for you- 6 slices
        pizzaSlices = pizzaSlices + 6;
        System.out.println("pizzaSlices = " + pizzaSlices);

        int players = 10;
        System.out.println("players = " + players);
        players = players * 2;
        System.out.println("players = " + players);

        int cents = 244;
        System.out.println("cents = " + cents);
        //keepwhole dollars portion and just assign remaining cents
        cents = cents % 100; // 100 100 44
        System.out.println("remaining cents = " + cents);
    }
}
