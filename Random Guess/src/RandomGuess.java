import java.util.Random;
import java.util.Scanner;

public class RandomGuess {
    public static void main(String[] args){
        Random random = new Random();
        int correctNumber = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int guess = 0;

        while (guess != correctNumber){
            System.out.println("Guess a number between 1 and 100: ");
            guess = scanner.nextInt();
            if (guess < correctNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > correctNumber) {
                System.out.println("Too high! Try again.");
            }
        }
        System.out.println("Nice! You guessed the right number!");
        scanner.close();
    }
}
