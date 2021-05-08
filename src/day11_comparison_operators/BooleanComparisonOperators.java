package day11_comparison_operators;

public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println( 10 == 10); //true
        System.out.println(1000 > 100); //true
        System.out.println(985.44 < 98547.8); //true
        System.out.println(10 <= 11); //true
        System.out.println(5>=3); // true
        System.out.println(-100 != 44); //true

        int a = 100;
        int b =200;
        System.out.println(a == b); //false
        System.out.println( a > b); //false
        System.out.println(a >= b); //false
        System.out.println(a <= b); //true
        System.out.println(a != b); //true

        boolean result = 5 ==5;
        System.out.println("result = " + result); //true

        result = 33 > 44;
        System.out.println("result = " + result); //false

        result = 88 < 99;
        System.out.println("result = " + result); //true

        result = 10 >= 10;
        System.out.println("result = " + result); //true

        result = 2 != 2;
        System.out.println("result = " + result);
        String city = "Seattle";
        System.out.println(city == "Seattle");
        System.out.println(city == "Baku");
        System.out.println(city != "Fairfax");

        String name = "Milica";
        boolean checkName = name == "Milica";
        System.out.println("checkName = " + checkName);
        checkName = name != "Nadir";

        int age = 66;
        boolean senorCitizen = age >= 65;
        System.out.println("is senorCitizen = " + senorCitizen);
    }
}
