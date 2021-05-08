package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args) {
        int expLast4SSN = 1234;
        int expPinCode = 4322;

        int Last4SSN = 1234;
        int pinCode = 4321;


        if( Last4SSN == expLast4SSN && pinCode == expPinCode) {
            System.out.println("Authentication successful");
        }else {
            System.out.println("Authentication unsuccessful");
            if (Last4SSN != expLast4SSN){
                System.out.println(" Last 4 SSN number is incorrect" );
            }
            if (expPinCode != expPinCode) {
                System.out.println("Pin code is incorrect");
            }
        }
    }
}
