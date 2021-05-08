package day17_ternary_nested_conditions;

public class MoreTernary {
    public static void main(String[] args) {
        int hourlyRate = 50;
        String status = (hourlyRate > 45) ? "Accept" : "Reject";
        System.out.println("status = " + status);

        String todaysClass = "Java";
        String teacher = todaysClass.equals("Java") ? "Murodil" : "Nadir";
        System.out.println("teacher = " + teacher);

        boolean isEligibaleToDrive = true;
        //"have DL and Can drave"   "No Dl, cannot drive"
        String driving = isEligibaleToDrive ? "have DL " : " not eligible";
        System.out.println("driving = " + driving);
    }
}
