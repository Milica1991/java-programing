package day54_abstraction;

/** we add abstract keyword to a class to make it an abstract class
 * WE cannot create object of Student class meaning
 * Student student = new Student: will show error
 * what can we do with this Student Class? we can extend this class by sub classes
 *Student class will PArent class for all types of student relatet classes
 */

public abstract class Student {

    public void code (String language) {
        System.out.println("Student is coding using " + language);
    }
        public abstract void attendClass ();


}
