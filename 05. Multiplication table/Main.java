import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        Integer number = scanner.nextInt();

        // First for loop guys!!!!
        for (Integer i = 1; i <= 10; i += 1) {
            Integer result = number * i;

            System.out.println(number + " * " + i + " = " + result);
        }

        scanner.close();
    }
}

// Damn, that was easy