package day55_abstraction;

public abstract class Exercise {
    public void start(){
        System.out.println("Warming up and starting the exercise");
    }
    //abstract method-method without body,just signature
     public abstract void perform();

     // purpose: letting sub classes implament/override their own way

    public abstract int getCaloriesCount(int minutes);



    /**
     * @param minutes = how long is exercise is performed
     * @return number of calories burned/used
     */

}
