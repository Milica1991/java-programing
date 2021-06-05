package day50_inheritance;

public class Teacher extends Person {
    int teacherID;

    public void teach(String topik){
        System.out.println("Teacher is teaching " + topik);
    }
}
