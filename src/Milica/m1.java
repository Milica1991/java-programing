package Milica;

import java.util.Locale;

public class m1 {
    public static void main(String[] args) {
        //            012345678910111213141516171819
        String str = "the fox ran under the bridge";
        str = str.substring(4,17);
        str.toUpperCase();
        System.out.println(str + "ground");


        String a = "today I will go to the beach";
        boolean b = a.contains("i");
        boolean c = a.substring(12).startsWith("go");

        String result = b && c ? "go" : "dont go";
        System.out.println(result);

        int num = 5;
        while(num < 100) {
            num += num;
        }
        System.out.println(num);


        int z = 0;
        do {
            z = z++ + --z - (z%3);
        }while (++z < 4);
        System.out.println(z);

    }
}
