package day43_list_custom_classes;

public class Person {
    String firstName;
    int age;
}
class People {
    public static void main(String[] args) {
        //create object of Person class - Instantiate Person class
        Person person1 = new Person();
        person1.firstName = "Milica";
        person1.age = 30;

        System.out.println(person1.firstName);
        System.out.println(person1.age);

    }
}
