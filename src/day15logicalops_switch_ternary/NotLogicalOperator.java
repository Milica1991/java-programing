package day15logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        //!= -> is not equal comparison operator
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 2;
        //check if age IS NOT more then 7. "Need to sit in child car seat. age
        if (!(age>7)) {
            System.out.println("Need to sit in child care seat. age: " + age);
        }else {
            System.out.println("Can sit normal seat. age = " + age);

            boolean isSmokingAllowed = false;
            //if smooking is not allowed print "Smoking is not allowed here. Exit"
            if (!isSmokingAllowed ) {

                System.out.println("Smoking is not allowes here. Exit");
            }

            String secretPassword = "abc123";
            String inputPassword = "abc321";
            if (!inputPassword.equals("abc123")){
                System.out.println("Incorrect password");
            }
             if (!inputPassword.equals(secretPassword)) {
                 System.out.println("Incorrect pasword");
             }
        }

    }
}
