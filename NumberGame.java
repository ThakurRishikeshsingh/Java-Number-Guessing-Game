import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        
        int targetNumber = rand.nextInt(100) + 1; // Number between 1 and 100
        int guess = 0;
        int attempts = 0;

        System.out.println("=== NUMBER GUESSING GAME ===");
        System.out.println("I have picked a number between 1 and 100. Try to guess it!");

        while (guess != targetNumber) {
            System.out.print("Enter your guess: ");
            guess = sc.nextInt();
            attempts++;

            if (guess > targetNumber) {
                System.out.println("Too high! Try a lower number.");
            } else if (guess < targetNumber) {
                System.out.println("Too low! Try a higher number.");
            } else {
                System.out.println("Congratulations! You found the number in " + attempts + " attempts.");
            }
        }
        sc.close();
    }
}