package day43_list_custom_classes;

public class Person {
    //Data -> variable
    String firstName;
    int age;
    char gender;
    //behaviour - method
    public void speak() {
        System.out.println("person is speaking");
    }
}
class People {
    public static void main(String[] args) {
        //create object of Person class - Instantiate Person class
        Person person1 = new Person();
        person1.firstName = "Milica";
        person1.age = 30;
        person1.gender = 'F';
        person1.speak();

        System.out.println(person1.firstName);
        System.out.println(person1.age);
        System.out.println(person1.gender);

        Person person2 = new Person();
        person2.firstName = "Mike";
        person2.age = 12;
        person2.gender = 'M';
        person2.speak();


        System.out.println(person2.firstName);
        System.out.println(person2.age);
        System.out.println(person2.gender);

        System.out.println("person1.firstname = " + person1.firstName);

    }
}
