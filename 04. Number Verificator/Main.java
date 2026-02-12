import java.util.Scanner;
// I'm starting to ger used to it

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number and the program will display the corresponding information: ");
        Integer number = scanner.nextInt();

        if (number % 2 != 0) {
            System.out.println("The number is odd.");
        } else {
            System.out.println("The number is even.");
        }

        if (number > 0) {
            System.out.println("The number is positive."); 
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        scanner.close();
    }
}