package day35_methods_with_param;

public class VoidMethods {
    /**
     * method name: print AtoZ
     * desc: prints English alphabet in all uppercase
     * @param args
     */
    public static void main(String[] args) {
        printAToZ();
        for (int i = 'A'; i <= 'Z'; i++){
            System.out.println(i + " ");
        }
    }
    public static void printAToZ(){
        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }
        //loop
        for (char i = 'A'; i <= 'Z'; i++){
            System.out.println(i + " ");
        }
        System.out.println();

    }
}
