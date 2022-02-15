import java.util.Scanner;
import java.util.Random;

class BinaryGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        int min = 1;
        int max = 1000;
        int maxGuesses = 15;

        int randNum = rand.nextInt(max + min) + min;

        for(int i=0; i<=maxGuesses; i++) {
            System.out.print("Enter guess: ");
            int playerNum = scanner.nextInt();

            if (playerNum < randNum) {
                System.out.print(playerNum + " is too low. ");
            }
            if (playerNum > randNum) {
                System.out.print(playerNum + " is too high. ");
            }
            if (playerNum == randNum) {
                System.out.println("You win");
                break;
            }
            if (i == maxGuesses) {
                System.out.println("You lose! The correct number was: " + randNum);
                break;
            }
        }
        scanner.close();
    }
}