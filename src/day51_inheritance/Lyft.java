package day51_inheritance;

public abstract class Lyft {

    public double calcutaleRate(double miles) {
        return miles * 4.5;
    }

    public abstract void calculateRate(double miles);
}
