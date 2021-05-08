package day17_ternary_nested_conditions;

public class AmazonPrime {
    public static void main(String[] args) {
        double itemPrice = 10;
        boolean isPrimeMember = false;

        if (!isPrimeMember) {
            if (itemPrice >=25.0) {
                System.out.println("Eligible for free regular shipping");
            } else {
                System.out.println("Not eligible for free shipping. fee is 10$");
            }
        } else {
            System.out.println("Eligible for 2 days free shipping");
        }

    }
}
