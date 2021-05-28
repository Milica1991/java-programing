package day45_opp;

import java.util.concurrent.Callable;

public class CoffeObject {
    public static void main(String[] args) {
        Coffee myCoffe = new Coffee();
        System.out.println("Coffe amount = " + myCoffe.getAmount());
        myCoffe.refile();
        System.out.println("amount after refill = " + myCoffe.getAmount());
        myCoffe.drink(10);
        System.out.println("amount after drink 10 = " + myCoffe.getAmount());
        // Not: myCoffe.type = "Turkish coffe" insted use the method
        myCoffe.setType("Turkish coffee");
        System.out.println("My coffee = " + myCoffe.getType());
        System.out.println(myCoffe.toString());

      //add another coffee object, set values, call methods
        Coffee coffee1 = new Coffee();
        coffee1.setType("cappuccino");
        System.out.println("coffee1 type =  " + coffee1.getType());
        //assign coffee1 object to coffee2
        //hey java, point coffee2 to same pbject as coffee1
        Coffee coffee2 = coffee1;
        System.out.println("coffee2 type = " + coffee2.getType());
        coffee2.setType("espresso");

        Coffee coffee4 = null; // refernce variable does not refer point to any object in HEAp
        coffee4.setType("turkish"); //



    }
}
