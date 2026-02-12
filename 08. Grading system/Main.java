import java.util.Scanner;

public class Main {
    public static void create_line(int amount) {
        System.out.print("\n" + "-".repeat(amount) + "\n");
    }

    public static boolean IsFloat(String str) {
        if (str == null) {
            return false;
        }
        try {
            Float.parseFloat(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the amount of subjects: ");

        String subjects_string = scanner.nextLine();
        float subjects_amount = 0;

        if (IsFloat(subjects_string) == true) {
            subjects_amount = Float.parseFloat(subjects_string);
            
        } else {
            System.out.println("Please only type numbers.");
            scanner.close();
            return;
        }

        if (subjects_amount == 0) {
            scanner.close();
            return;
        } else if (subjects_amount > 10) {
            System.out.println("The subject limit is 10.");
            scanner.close();
            return;
        }

        String[] numbering = {"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth", "nineth", "tenth"};

        String[] subjects = new String[Float.valueOf(subjects_amount).intValue() + 1];
        
        create_line(60);
        for (int i = 1; i <= subjects_amount; i += 1) {
            System.out.print("Enter the name of the " + numbering[i - 1] + " subject: ");
            subjects[i] = scanner.nextLine();

            if (subjects[i].equals("")) {
                System.out.println("Please type a valid name.");
                scanner.close();
                return;
            }
        }

        for (int i = 1; i <= subjects_amount; i += 1) {
            create_line(60);
            System.out.println("Enter your notes for the following subject: " + subjects[i]);

            Float subject_result = 0.0f;

            for (int j = 0; j <= 3; j += 1) {
                System.out.print("Enter your " + numbering[j] + " grade: ");
                String grade_String = scanner.nextLine();
                Float grade = 0.0f;

                if (IsFloat(grade_String) == true) {
                    grade = Float.parseFloat(grade_String);
                } else {
                    System.out.println("Please only type numbers.");
                    scanner.close();
                    return;
                }

                subject_result += grade;
            }

            Float average = subject_result / 4.0f;

            System.out.println("Your average grade in " + subjects[i] + " was: " + String.format("%.2f", average));
        }

        scanner.close();
    }
}