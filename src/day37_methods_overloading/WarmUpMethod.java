package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {
        loginVoid("cybertekStudent", "abc123"); //POSITIVE TEST / SUNNY DAY
        System.out.println(login("cybertekStudent", "abc123"));
        System.out.println(login("cybertekStudent", "abc124"));
    }
    public static void loginVoid(String userName, String password) {
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";

        if(userName.equals(secretUserName) && password.equals(secretPassword)) {
            System.out.println("Login Successful, welcome back Cybertek student!");
        } else {
            System.out.println("Incorrect username or password!");
        }
    }
    public static boolean login(String userName, String password) {
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";
        boolean successfulLogin = true;
        if(userName.equals(secretUserName) && password.equals(secretPassword)) {
            return successfulLogin;
        } else {
            return false;
        }





    }
}