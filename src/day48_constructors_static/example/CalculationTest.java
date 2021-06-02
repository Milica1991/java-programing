package day48_constructors_static.example;

import java.util.concurrent.Callable;

public class CalculationTest {
    public static void main(String[] args) {
        //add is static method, can be called using Classname.staticMethodName
        //Static way of calling the method
        Calculator.add(5, 3);

        //Calculator.multiply (2,4); error multiply is not static.need object to call
        //multipy is instance method and we are creating object then calling it
        Calculator calculator = new Calculator();
        calculator.multiply(2,4);
       //static method can also be called using an object

        
       // calcObject.add(10,42);
    }
}
