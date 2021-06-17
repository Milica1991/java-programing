package day54_abstraction;

/** OnlineStudent class will extendent student class
 * This class is considered to be concrete class.
 * It is responsible to implement all abstract methods (if any)
 */

public class OnlineStudent extends Student {
    @Override
    public void attendClass() {
        System.out.println("Online student is attending the class using  zoom");

    }
    //public abstract void askQuestion();error abstract method cannot be normal class
}
