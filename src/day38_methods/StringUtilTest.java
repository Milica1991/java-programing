package day38_methods;

import static day38_methods.StringUtils.*;

public class StringUtilTest {
    public static void main(String[] args) {
        String userName = "";
        if(StringUtils.isNullOrEmpty(userName)) {
            System.out.println("FAIL: Username cannot be null or empty");
        }
        System.out.println("civic = " + StringUtils.isPalindrome("civic"));
        System.out.println("isPalidrome(kayak) = " + StringUtils.isPalindrome("kayak"));
    }
    public static boolean isPalindrome(String str ){
        str = str.toLowerCase();
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }
        }
        return true;

    }
}
