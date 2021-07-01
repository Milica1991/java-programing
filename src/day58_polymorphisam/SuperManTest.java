package day58_polymorphisam;

public class SuperManTest {
    public static void main(String[] args){
        Father spMan1 = new SuperMan();
        spMan1.playWithKid();
        spMan1.feedKid();
        spMan1.raiseKid();
       // spMan1.work("SDET"); ERROR spMan1 is Father type can only access methods in father
        Worker spMan2 = new SuperMan();
        spMan2.work("SDRT");
        System.out.println("got paid $" + spMan2.getPaid());
        //spMan2.raistKid(); Error

        SuperMan spMan3 = new SuperMan();
        spMan3.getPaid();
        spMan3.work("Scram Master");
        spMan3.feedKid();
        spMan3.playWithKid();
        spMan3.raiseKid();


    }
}
