package day55_abstraction;

public class Swimming extends Exercise{
    @Override
    public void perform() {
        System.out.println("Performing swimming at a pool or ocean");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 11;
    }
}
