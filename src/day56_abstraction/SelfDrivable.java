package day56_abstraction;

public interface SelfDrivable {
    void autoPiloting();
    //void selfPark(); this causes eroor in sub classes because they must override abstract method
    public default void selfPark() { //if we add default method it will prevent errors
        System.out.println("performing self park steps");

    }


}
