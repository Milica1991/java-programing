package day20_string_manipulation;

public class StringIsEmpty {
    public static void main(String[] args) {
        String jobTitle = "";
        System.out.println(jobTitle.isEmpty());
        System.out.println(jobTitle.length());
        System.out.println(jobTitle.equalsIgnoreCase(""));
        System.out.println(jobTitle.length() == 0);

        if (jobTitle.isEmpty()) {
        System.out.println("JobTitle is missing please resend");
        }else{
            System.out.println("Job title looks good");
        }
        if (jobTitle.length() == 0) {
            System.out.println("jobTitle is empty" );
        }else{
            System.out.println("jobTitle is not empty" );
        }
        System.out.println(jobTitle.equals(""));
        if("".equals(jobTitle)) {
            System.out.println("Job Title is not empty");
        }
        String word = " ";
        System.out.println(word.isEmpty());
        System.out.println(word.length());

        String veggie = "carrots";
        System.out.println(veggie.isEmpty());
        //if veggie is not empty,print we have carrots
        if(!veggie.isEmpty()){
            System.out.println("we have " + veggie);
        }
        //String word2;
       //System.out.println(word2.isEmpty());error

    }
}
