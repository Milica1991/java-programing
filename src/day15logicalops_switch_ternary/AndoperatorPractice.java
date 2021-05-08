package day15logicalops_switch_ternary;

public class AndoperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "wooden spoon";

        if (onSale && freeShipping) {
            System.out.println("Adding to cart - " + itemName);
        } else {
            System.out.println("Continue shopping for good deals on-" + itemName);
        }

        //add to card only when it is freeShipping, onSale and itemName is +Wooden Spoon




    }
}
