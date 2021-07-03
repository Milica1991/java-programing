package day57_abstraction_polymorphism;

public interface InterfaceA {
    public static final String TYPE = "interface";
    double MAX_COUNT = 500;// this is also public static final

    public abstract void absMethodD(int num);

    /**
     * starting from Java (jdk 1.8)
     * interface can have static and default method
     * @param str
     */
    public static void staticMethodE(String str) {
        System.out.println("staticMethodE is called with str - " + str);
    }
    public default void defaultMethodF() {
        System.out.println("defaultMethodF is called");
    }
}
