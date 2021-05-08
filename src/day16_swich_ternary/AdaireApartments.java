package day16_swich_ternary;

public class AdaireApartments {
    public static void main(String[] args) {
        System.out.println("####Welcome to Adaire Apartments");
        int numberOfBedrooms = 0;
        double startingPrice = 0.00;

        switch (numberOfBedrooms) {
            case 0:
                System.out.println("Studio apartment selected");
                startingPrice = 1454;
                break;
            case 1:
                System.out.println("1 bedroom apartment selected");
                startingPrice = 1725;
                break;
            case 2:
                System.out.println("2 bedroom apartment selected");
                startingPrice = 2899;
                break;
            default:
                System.out.println("Invalid number");
                break;
    }
    }
}
