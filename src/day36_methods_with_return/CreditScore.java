package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(721);
        checkEligible(821);
        checkEligible(621);


    }

    public static void checkEligible(int creditScore){

        if( creditScore >= 700){
            System.out.println("You are eligible for leasing the car");
        }else{
            System.out.println("Sorry, you are not eligible for leasing this car");
        }



    }
}
