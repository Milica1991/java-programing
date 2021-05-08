package day16_swich_ternary;

public class CappuccinoBayer {
    public static void main(String[] args) {
        /*declare
price    ->
calories ->
size could be "tall", "grade" ,"venti"

when size = "tall"
    print "Tall Cappuccino please"
    price    ->  3.69
    calories ->  90

when size = "grade"
    print "Grande Cappuccino please"
    price    ->  3.99
    calories ->  120

when size = "venti"
    print "Venti Cappuccino please"
    price    ->  4.29
    calories ->  150

any other size:
    print "We do'nt serve that size of Cappuccino"


print "Total price: $3.69"
      "You will consume 90 cal of energy"
         */
        String size = "tall";
        double price = 0.0;
        int calories = 0;
        if (size.equals("tall" )) {
        }
        switch (size) {
            case "tall":
                System.out.println("Tall Cappuccino please" );
                break;
            case "grande":
                System.out.println("Grande cappuccino please" );
                break;
            case "venti":
                System.out.println("Venti cappuccino please" );
                break;
            default:
                System.out.println("We dont serve that " + size + " Cappuccino " );
                break; //optional
        }
    }
}
