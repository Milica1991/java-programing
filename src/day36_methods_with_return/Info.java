package day36_methods_with_return;
import java.util.*;
public class Info {
    public static void main(String[] args) {
        fullName();
        System.out.println("Full name = " + fullName());
        System.out.println("isMarried = " + isMarried());
        System.out.println("age = " + getAge());
        System.out.println("Birth Year = " + getRandomYear());

        String name = fullName();
        boolean married = isMarried();
        int age = getAge();
        int year = getRandomYear();
        System.out.println("name = " + name);
        System.out.println("married = " + age);
        System.out.println("year = " + year);
    }

        //Method name: fullName
        //No params
        //returns "Mike Smith"
        //
        //Method name: isMarried
        //return false
        //
        //method name: getAge
        //returns 35
        //You do not have permission to send messages in this channel.

        public static  String fullName() {
            return "Mike Smith";
        }
        public static boolean isMarried() {
            return false;
        }
        public static int getAge() {
            int age = 35;
            return age;
        }
        public static int getRandomYear() {
        Random random= new Random();
        int randomYear = random.nextInt(2021);
        return randomYear;

        }

}
