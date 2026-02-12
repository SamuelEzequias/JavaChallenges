// New imports babyyyyy
import java.util.Random;
import java.util.Scanner;

public class Main {
    // I'm going to make an improvement.
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Integer min_value = 1;
        Integer max_value = 10;

        Integer randomNumber = random.nextInt(max_value - min_value + 1) + min_value;

        System.out.print("Try to guess the number that is between 1 and 10: ");
        String guessString = scanner.nextLine();
        Integer guessNumber = 0;

        if (isInteger(guessString) == true) {
            guessNumber = Integer.parseInt(guessString);
        } else {
            System.out.println("Your number is not a Integer");
            scanner.close();
            return;
        }

        if (guessNumber > 10 || guessNumber < 1) {
            System.out.println("Your number isn't between 1 and 10.");
            scanner.close();
            return;
        }

        if (guessNumber == randomNumber) {
            System.out.println("Congrats! You guessed the correct number");
        } else {
            System.out.println("Sorry, you guessed wrong.");
            System.out.println("The number was: " + randomNumber);
        }

        scanner.close();
    }
}