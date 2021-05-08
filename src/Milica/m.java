package Milica;

public class m {
    public static void main(String[] args) {
        String s = "java is fun";
        int c = s.charAt(4);

        if (c=='a'){
            System.out.println("A");
        }else if (c == ' '){
            System.out.println("B");
        }else {
            System.out.println("C");
        }
        String a= "123";
        String b = 5 + 4+a;
        System.out.println(b); //9123

        String result = 3425 > (9*1000) ? "garden" : "patio";
        result.substring(2);
        System.out.println(result);

        String s1="the game was tied at 2-2";
        String s2 = s1.substring(5);
        int index1 = s1.indexOf("game");
        int index2 = s2.indexOf("game");

        if (index1 == index2) {
            System.out.println(index1);
        }else{
            System.out.println(index2);
        }
        //String index out of bounds exception
        String z = "popcorn";
        z=z.substring(1,8);
        if (z.equals("opcor")){
            System.out.println(z.length());
        }else{
            System.out.println(z.replace("o","a"));
        }
    }
}
