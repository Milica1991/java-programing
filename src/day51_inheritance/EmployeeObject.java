package day51_inheritance;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee developer = new Employee();
        developer.jobTitle = "Java Developer";
        System.out.println("developer.calculateSalary(55.0) = " + developer.calculateSalary(55.0));
        double anualDevSalary = developer.calculateSalary(63.0);
        System.out.println("anualDevSalary = " + Math.round(anualDevSalary));

        Contractor sdetConstractor = new Contractor();
        sdetConstractor.jobTitle = "SDET";
        double sdetSalary = sdetConstractor.calculateSalary(55.0);
        System.out.println("sdetSalary = " + sdetSalary);

        System.out.println(developer.toString());
        System.out.println(sdetConstractor);

    }

}
