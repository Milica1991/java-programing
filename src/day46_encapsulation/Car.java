package day46_encapsulation;

public class Car {
    //encapsulated/hidded instance variables
   private String model;
   private int year;
   private int mileage;//this.milaeage

   //seter method for model
    public void setModel(String carModel) {
        model = carModel;

    }
    //getting method for model

    public String getModel() {
        return model;
    }
    //setter for year
    public void setYear(int year) {
        this.year = year;
    }
    //getter for year
    public int getYear() {
        return year;

    }
    //getter setter for milage
    //generate toString
    public  int getMileage() {
        return this.mileage;
    }
    //myCar.setMileage(45230)
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}

