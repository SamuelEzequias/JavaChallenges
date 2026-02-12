import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] vowels = {"a", "e", "i", "o", "u"};

        System.out.print("Enter a phrase: ");
        String phrase = scanner.nextLine().toLowerCase();
        
        int vowels_amount = 0;

        for (int i = 0; i <= phrase.length() - 1; i += 1) {
            for (int j = 0; j <= vowels.length - 1; j += 1) {
                if (Character.toString(phrase.charAt(i)).equals(vowels[j])) {
                    vowels_amount += 1;
                }
            }
        }

        System.out.println(vowels_amount);

        scanner.close();
    }
}