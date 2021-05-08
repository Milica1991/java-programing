package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i")); // true
        System.out.println(company.contains("ital")); //true
        System.out.println(company.contains("l o")); //true
        System.out.println(company.contains("j")); //false

        //if company contains space.print "multiple words company name "
        //elsew "single word company name"

        if (company.contains("space")) {
            System.out.println("multiple words company name");
        }else{
            System.out.println("single word company name");
        }
        String etsyTitle = "Wooden spoon| Etsy";
        //check if "|" is in etsytitel
        if(etsyTitle.contains("Pass-title check passed")){
        }else {
            System.out.println("Fail-title check faild");
        }

        String firstName = "Ahmed";
        //check if firstName contains "A" and "e" at same time.
        if (firstName.contains("a") && firstName.contains("e")){
            System.out.println("both a && are present");
        }else {
            System.out.println("a || e not present");
        }
        firstName = "Nadir";
        if (firstName.contains("a") || firstName.contains("i")) {
            System.out.println("a or i is present");
        }else{
            System.out.println("not a or i is present");
        }
        String email = "djoric.milica91@yahoo.com";
        //
        if (email.contains("@") && email.endsWith(".com")) {
            System.out.println("valid email");
        }else{
            System.out.println("invalid email");
        }

    }
}
