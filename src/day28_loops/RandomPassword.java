package day28_loops;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGIJKLMOPQRSTUVWXYZaccdefghijklmopqrstuvwxyz0123456789_@#$%^&*";
        Random random = new Random();
        String password ="";
        for (int i = 1; i <= 8; i++) {
            int index = random.nextInt(68);
            System.out.print(source.charAt(index));
            //System.out.print(random.nextInt(sorce.length()));
           // password = password + source.charAt(index);
            password += source.charAt(index);
        }
        System.out.println("\nYourPassword = " + password);

    }
}
