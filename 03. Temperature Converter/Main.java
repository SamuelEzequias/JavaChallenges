import java.util.Scanner;
// Here we go again

public class Main {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature: ");
        Float temperature = scanner.nextFloat();

        scanner.nextLine();

        System.out.print("Now type in the temperature scale you want to convert to (Celsius, Fahrenheit): ");
        String scale = scanner.nextLine();
        
        Float result = 0.0f;
        String measurement = "";

        if (scale.equals("Celsius")) {
            result = (temperature - 32) * 5f/9f;
            measurement = "C";
        } else if (scale.equals("Fahrenheit")) {
            result = (temperature * 9f/5f) + 32;
            measurement = "F";
        } else {
            System.err.println("Temperature type not found, did you type it wrong?");
            scanner.close();
            return;
        }

        System.out.println("The converted temperature is: " + String.format("%.2f", result) + "°" + measurement);

        scanner.close();
    }
}

// No comment on that.