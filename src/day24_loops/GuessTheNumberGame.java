package day24_loops;
import java.util.Scanner;
public class GuessTheNumberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretNumber = (100);
        int guessingNumber = 0;
        do {
            System.out.println("Enter Your GUess Number:");
            guessingNumber = scan.nextInt();
            if(guessingNumber>secretNumber) {
                System.out.println("Wrong number is too large" );
            }else if(guessingNumber < secretNumber){
                System.out.println("Your number is too small");
            }
        }while (guessingNumber != secretNumber);

        System.out.println("Congratulation, you won!");

    }

    }
