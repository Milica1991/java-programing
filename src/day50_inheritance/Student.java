package day50_inheritance;

public class Student extends Person {
    String school;

    public void school(String topic){
        System.out.println("student is studying"+ topic);
        System.out.println(name + "is stadying "+topic +"at " + school);

        }

    public void study(String java_programing_inheritance) {
    }
}
