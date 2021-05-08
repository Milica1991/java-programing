package day35_methods_with_param;

public class MethodsWithParams {
    public static void main(String[] args) {
        displayValue(1);
        displayValue(94);
        int count = 55;
        displayValue(count); //num = count;

        greetByName("Saim");
        greetByName("Milica");
        String name = "Andrijana";
        greetByName(name);

    }

    public static void displayValue(int num) {
        System.out.println("value is " + num);
    }

        /** method name: greetByName
         * input: String name
         * It prints "hello{name} how are you?
         */
        public static void greetByName(String name) {
            System.out.println("Hello " + name + " how are you today?");

    }

}
