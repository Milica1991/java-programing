package day19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "intellij idea";
        System.out.println(word.startsWith("i"));
        System.out.println(word.startsWith("in"));
        System.out.println(word.startsWith("intellij"));
        System.out.println(word.startsWith("intellij idea"));
        System.out.println("java".startsWith("j"));

        System.out.println(word.startsWith("Int"));
        System.out.println(word.startsWith("idea"));
        System.out.println(word.startsWith("a"));


        String name = "Milica";
        if(name.endsWith("a")) {
            System.out.println("Maybe it is a female name");
        }
        /**
         * Mr- man
         * Dr.- doctor
         * Mrs. - marrid women
         * Ms.- single woman
         * Sr.- Senior
         */

        String firstName = "Dr. Nadir";
        if (firstName.startsWith("Mr.")){
            System.out.println("Man");
        } else if (firstName.startsWith("Dr.")){
            System.out.println("Doctor");
        }else if (firstName.startsWith("Mrs.")){
            System.out.println("Married Woman");
        }else if (firstName.startsWith("Ms.")){
            System.out.println("Single Women");
        }else if (firstName.startsWith("Sr.")){
            System.out.println("Senior");
        }else{
            System.out.println("Normal name");

            /**
             * String url = "https://www.stackoverflow.com"
             *.com = "Commercial website"
             * .ru ='russian website
             * .gov= "Government website"
             * .eu= "education website
             * .org = "Organization website"
             */

            String url = "https://www.stackoverflow.com";
            if (url.endsWith(".com")) {
                System.out.println("Commercial website ");
            }else if (url.endsWith(".ru")) {
                System.out.println("russian website");
            }else if (url.endsWith(".gov")){
                System.out.println("Government website");
            }else if (url.endsWith(".eu")) {
                System.out.println("education website");
            }else if (url.endsWith(".org")){
                System.out.println("Organization website ");
            }
        }
    }
}
