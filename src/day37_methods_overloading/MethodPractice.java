package day37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {
        System.out.println(reapitString("hi", 3, '|'));
        System.out.println(reapitString("I can do it ", 10, '-'));
    }
    public static String reapitString(String word, int times, char delimiter){
        String retValue = "";
        for (int i = 1; i <= times; i++) {
            //take care of last delimiter:
            if(i == times){
                retValue+=word;
            }else {
            retValue += word + delimiter;
            }
        }
       return retValue;
    }
}
