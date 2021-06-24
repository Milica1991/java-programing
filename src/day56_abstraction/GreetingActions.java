package day56_abstraction;

public class GreetingActions {
    public static void main(String[] args) {
        MountainLanguage ml = new MountainLanguage();
        ml.hi();
        ml.bye();

         Greeting gt = new MountainLanguage();
         gt.hi();
         gt.bye();

         Jappanese jp = new Jappanese();
         jp.hi();
         jp.bye();

         gt = new Jappanese();
         gt.hi();
         gt.bye();
    }
}
