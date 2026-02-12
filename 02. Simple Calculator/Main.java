import java.util.Locale;
import java.util.Scanner;
// Do we realy need a new import just do have a input?

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Why am i surprised?

        scanner.useLocale(Locale.ENGLISH);
        // Ok, this is cool
        
        // First Value
        System.out.print("Type the first value: ");
        Float value_one = scanner.nextFloat();

        // Second Value
        System.out.print("Type the second value: ");
        Float value_two = scanner.nextFloat();
        
        // Result variable
        Float result = 0.0f;
        
        // Clear buffer
        scanner.nextLine();

        // Type one character
        System.out.print("Type one character (- + * /): ");
        String Math_type = scanner.nextLine();

        // I was trying to do if (Math_type == "-")...
        if (Math_type.equals("-")) {
            result = value_one - value_two;
        } else if (Math_type.equals("+")) {
            result = value_one + value_two;
        } else if (Math_type.equals("*")) {
            result = value_one * value_two;
        } else if (Math_type.equals("/")) {
            result = value_one / value_two;
        }

        scanner.close();
        // Impressive

        System.out.println("The result of this equation is: " + String.format("%.2f", result));
    }
}