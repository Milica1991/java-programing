package day16_swich_ternary;

public class Elevator {
    public static void main(String[] args) {

      //declare variable floorNum = 1
        //Multi branch if:
       // when floorNum is 1 -> print
        // when floorNum is 2 -> print \
        //when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
        //anything else: print "Invalid floor - 6"

        int floorNum = 1;

        if(floorNum ==1) {
            System.out.println("Fllor 1 selected. Companis: Lobby,Verizon,Starbuks");
        } else if (floorNum == 2) {
            System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat");
        } else if (floorNum == 3) {
            System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house ");
        }else {
            System.out.println("Invalid floor " + floorNum);
        }
        System.out.println("=====SWITCH STATEMENT VERSION===== ");
        floorNum = 1;
        switch(floorNum) {
            case 1:
                System.out.println("Floor 1 selected. Companies: Lobby, Verizon, Starbucks" );
                break;
            case 2:
                System.out.println("Floor 2 selected. Companies: Cybertek, NASA, Intelsat" );
                break; //exit the switch statement
            case 3:
                System.out.println("Floor 3 selected. Companies: Lyft, BofA, Stake house" );
                break;


        }
    }
}
