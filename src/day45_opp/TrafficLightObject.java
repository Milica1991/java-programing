package day45_opp;

public class TrafficLightObject {
    public static void main(String[] args) {
        //create traffic light object
        TrafficLight trafficLight = new TrafficLight();
        //trafficLight.color = "red"; Not this way today
        // we will assign/update the value of color using a method of class
        trafficLight.changeColor("red");
        //System.out.println(trafficLight.color); Direct access to variable
        //call method to access the variable
        trafficLight.setColor();

        trafficLight.changeColor("green");
        trafficLight.setColor();

        TrafficLight trafficLight2 = new TrafficLight();
        trafficLight2.color = "brown";
        trafficLight2.setColor();
    }
}
