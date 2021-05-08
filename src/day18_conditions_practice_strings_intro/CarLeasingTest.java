package day18_conditions_practice_strings_intro;

public class CarLeasingTest {
    public static void main(String[] args) {
        String make = "Mercedes";
        String model = "E";
        double leastPrice = 0.0;

        if(make.endsWith("Mercedes") && model.equals("E")) {
            leastPrice = 400.0;
        }else if (make.equals("Mercedes") && model.equals("A")){

        }if(make.equals("Mercedes")){
            if(model.equals("E")){
                leastPrice=500;
            }else if(model.equals("A")){
                leastPrice=400;
            }else {
                System.out.println("Invalid make" );
                return; //exit program/ exit main method
            }


        System.out.println("make = " + make);
        System.out.println("model = " + model);
        System.out.println("leastPrice = " + leastPrice);
    }
    }
}
