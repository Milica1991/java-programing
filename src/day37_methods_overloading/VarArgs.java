package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(10, 5);
        addNumbers(100, 200, 300);
        addNumbers(23, 45,23,54,23,45,3,35,65,98,75,15,3);
        addNumbers();
    }
    public static void addNumbers(int... nums) {
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        System.out.println("sum = " + sum);
    }
}
