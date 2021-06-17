package day54_abstraction;

public class Pizza extends MenuItem{

    @Override
    public void prepare() {
        System.out.println("Stretch the dough and put toppings");

    }

    @Override
    public void serve() {
        System.out.println("serve in plate or in box");

    }
}
