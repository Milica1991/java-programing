package day27_loops;

public class RedStringPorsion {
    public static void main(String[] args) {
                     //0123456789
        String list = "cat,car,cat,black cat,red car";
        for (int i = 0; i < list.length()-2; i++ ) {
            System.out.println(list.substring(i, i + 3));
            //String part = list.substring
            if (list.substring(i, i + 3).equals("cat") || list.substring(i, i +3).equals("car")){
                System.out.println("car or cat found");
            }
        }
        //System.out.println(list.substring(, 3));
       // System.out.println(list.substring(1, 4));
        //System.out.println(list.substring(2, 4));
       // System.o {}ut.println(list.substring(3, 5));
       // System.out.println(list.substring(3, 6));
        //System.out.println(list.substring(4, 7));
    }
}
