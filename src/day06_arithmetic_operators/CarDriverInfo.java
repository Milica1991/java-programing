package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args){
        String carModel = "Dodge charger";
        String driverName = "Donald Trump";
        String LicenceNumber ="LetMakeJavaGreatAgain12345";
        short speed= 55;
        boolean isAutomatic = true;
        char licenseClass = 'D';

        System.out.println("Car model : " + carModel);
        //Dodge charger is car model.
        System.out.println(carModel + " is car model.");
        System.out.println("Driver name: " + driverName);
        System.out.println(driverName + " is driving a car");

        //Donald Trumo is driving Dodge charger

        System.out.println(driverName + carModel);

        System.out.println("Current speed is: " + speed);
        //Curent speed is: 55 mph
        System.out.println("Current speed : " + speed + "mph");

        System.out.println("is car automatic->" + isAutomatic);
        System.out.println(licenseClass+" - "+ isAutomatic);

    }
}
