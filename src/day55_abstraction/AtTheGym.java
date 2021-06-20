package day55_abstraction;

import sun.security.rsa.RSASignature;

public class AtTheGym {
    public static void main(String[] args) {
        Exercise exercise = new Running();
        Running running = new Running();
        Swimming swimming = new Swimming();
        FreeWeight freeWeight = new FreeWeight();

        exercise.start();
        exercise.perform();
        System.out.println("Running 30 minutes - calories = " + exercise.getCaloriesCount(30));

        swimming.start();
        swimming.perform();
        System.out.println("Swimmimg 30 minutes - calories = " + exercise.getCaloriesCount(30));

        freeWeight.start();
        freeWeight.perform();
        System.out.println("Freeweight 30 minutes - calories = " + exercise.getCaloriesCount(30));
    }
}
