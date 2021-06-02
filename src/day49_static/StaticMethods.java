package day49_static;

import java.util.Enumeration;

public class StaticMethods {

    int num = 10;
    static int count = 5;

    public static void displayMessage(String message) {
        System.out.println("message: " + message);
        //System.out.println("num = " + num); //Error: num is instance variable static cannot acces
        System.out.println("count = " + count); // no error,count is static variable
    }
    public static void anotherStaticMethod() {
        System.out.println("another static method");
        displayMessage("wooden spoon");
    }
    //StaticMethods.instantMethods(); > no
    //StaticMethods stm = new StaticMethods();
    //stm.instanceMethod();
    public void instatnceMethod() {
        System.out.println("instatnMethod");
        System.out.println("count = " + count);
        displayMessage("hello from instance methods");
    }
}
