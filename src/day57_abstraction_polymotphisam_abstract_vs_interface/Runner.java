package day57_abstraction_polymotphisam_abstract_vs_interface;

public class Runner {
    public static void main(String[] args) {
        /**
         * we can not create object neither of them

        AbstractA absA = new AbstractA();
        InterfaceA iA = new InterfaceA();
        */
        InterfaceA.staticMethodE("wooden spoon");
        //ConcreteA.staticMethodC("hello"); -> staticMethodE only works with interface
        ConcreteA.staticMethodC();
    }
}
