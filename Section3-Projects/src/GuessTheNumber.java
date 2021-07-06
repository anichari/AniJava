import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();
        int num_guesses = 0;
        int user_guessed;
        int generated = random.nextInt(100) + 1;
        String enterGuess = "Enter your guess:\t";
        System.out.println(enterGuess);
        user_guessed = keyboard.nextInt();
        while (user_guessed != generated) {
            num_guesses ++;
            if (user_guessed < 1 || user_guessed > 100) {
                System.out.println("That was a wasted guess! Pick a number between 1 and 100 inclusive!");
            } else if (user_guessed < generated) {
                System.out.println("Your guess was too low");
            } else if (user_guessed > generated) {
                System.out.println("Your guess was too high");
            }
            System.out.println(enterGuess);
            user_guessed = keyboard.nextInt();
        }
        System.out.println("Congratulations! You guessed the number in " + num_guesses + " guesses! Thanks for playing!");
    }
}
