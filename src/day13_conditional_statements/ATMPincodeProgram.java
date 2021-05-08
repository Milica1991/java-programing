package day13_conditional_statements;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        System.out.println("**** WELCOME TO TD BANK ATM ****");
        int secretPincode = 1234;
        int inputPincode = 12324;

        if (secretPincode == inputPincode) {
            System.out.println("Welcome to your account");
            System.out.println("You can withdraw, check your balance,deposit");
        } else {
            System.out.println("icorrect pincode! " + inputPincode);
            System.out.println("Please try again ");
        }



    }
}
