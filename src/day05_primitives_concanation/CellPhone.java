package day05_primitives_concanation;

public class CellPhone {
    public static void main(String[] args) {
        String brand = "Apple";
        String model = "iPhone 11";
        String color = "Red";
        double price = 699.0;
        int storage = 256;
        boolean hasCamera = true;

        System.out.println(brand);
        System.out.println(model);
        //WITH MESSAGE
        System.out.println("Brand is "+ brand);
        System.out.println("Model is " + model);
        System.out.println("Color is " + color);
        System.out.println("Price is " +price);
        System.out.println("Storage is " + storage + "GB");
        System.out.println("Has camera? - " + hasCamera);
    }
}
