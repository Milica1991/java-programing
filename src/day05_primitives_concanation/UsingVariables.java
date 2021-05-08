package day05_primitives_concanation;

public class UsingVariables {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = num1;
        System.out.println(num1);//100
        System.out.print(num2);//100

        num1 = 200;
        System.out.println(num1);//200
        System.out.println(num2);//100

        int n1 = 55;
        int n2 = n1;
        int n3 = n2;

        /*
        n1 -> 55
        n2 -> 55
        n3-> 55

         */
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        
        int inthirasZipCode = 22182;
        int parvinsZipC0de = inthirasZipCode;

        System.out.println(inthirasZipCode);
        System.out.println(parvinsZipC0de);

        inthirasZipCode = 20007;
        parvinsZipC0de = 33131;
        System.out.println(inthirasZipCode);
        System.out.println(parvinsZipC0de);


    }
}
