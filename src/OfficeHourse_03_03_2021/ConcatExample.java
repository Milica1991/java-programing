package OfficeHourse_03_03_2021;

public class ConcatExample {

    public static void main(String[] args) {

        System.out.println("1" + "2" +"3"); //123
        System.out.println(1 + 2 + 3); //6
        System.out.println(1 + 2 + "3"); //33
        System.out.println("1" +2 + 3); //123
        System.out.println("1" + (2 + 3)); //15



        int age = 30;
        int ageInDays = 365 * age;
        System.out.println("You are " + age + " years old! " +
                "That means you are " + ageInDays + " day old");



    }
}
