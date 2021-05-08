package day15logicalops_switch_ternary;

public class JobOffterSelector {
    public static void main(String[] args) {
        String location = "Honolulu ";
        double salary = 120_000;
        boolean isRemote = true;
        boolean hasBenefits = true;

        if (location.equals("Honolulu" ) && salary >= 120_000 && isRemote && hasBenefits) {
            System.out.println("Sure, I accept this offer" );
        } else {
            System.out.println("Keep looking" );

        }
    }

}