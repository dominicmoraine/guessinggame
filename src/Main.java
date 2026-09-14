import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int secretNumber = random.nextInt(100) + 1;

        int guess = 0;
        int attempts = 0;
        System.out.println("Number Guessing Game");
        System.out.println("--------------------");
        System.out.println();
        System.out.println("I am thinking of a number between 1 and 100.");
        while (guess != secretNumber) {

            System.out.print("Enter your guess: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a whole number!!");
                scanner.next();
                continue;
            }

            guess = scanner.nextInt();
            if (guess < 1 || guess > 100) {
                System.out.println("Invalid guess. Please enter a number between 1 and 100");
                continue;
            }
            attempts++;

            if (guess > secretNumber) {
                System.out.println("Too high. Try again.");
            } else if (guess < secretNumber) {
                System.out.println("Too low. Try again");
            } else {
                System.out.println("Correct! You guessed the number.");
            }
            System.out.println();
        }
        System.out.println("You won in " + attempts + " attempts.");
        System.out.println("Thank you for playing!");
        scanner.close();
    }
}