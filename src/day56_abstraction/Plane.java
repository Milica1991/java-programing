package day56_abstraction;

public class Plane extends Transportation implements SelfDrivable, Greeting{


    @Override
    public void autoPiloting() {
        System.out.println("Flayting on auto - pilot");

    }

    @Override
    public void transportPeople() {
        System.out.println("Tesla is trasporting people on the road");

    }

    @Override
    public void cost(int mile) {
        System.out.println("Plane coust " + (mile * 25.0) + " to drive " + mile + " miles");
    }

       @Override
        public void hi() {
            System.out.println("Welcome aboard");

        }

        @Override
        public void bye() {
            System.out.println("Thanks!");

        }

    }

