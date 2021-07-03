package day57_abstraction_polymorphism;

public class ConcreteA extends AbstractA implements InterfaceA, InterfaceB {
    @Override
    public void absMethodA() {
        System.out.println("absMethodA implementation is called");

    }

    @Override
    public void methodB() {
        System.out.println("methodB overridden version is called");
    }

    //Static method are hidden
    public static void staticMethodC() {
        System.out.println("staticMethodC hidden version is called");
    }
    @Override
    public void absMethodD(int num) {
        System.out.println("absMethodD overridden version is called - " + num);
    }
}