ppackage org.example;

import java.util.Scanner;

public class InputValidator {

    public static int getValidatedInput(int lower, int upper, String prompt, String errorMessage, int defaultVal) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(prompt);
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("default")) {
                return defaultVal;
            }

            if (input.equalsIgnoreCase("exit")) {
                System.exit(0);
            }

            try {
                int value = Integer.parseInt(input);
                if (value >= lower && value <= upper) {
                    return value;
                } else {
                    System.out.println("\n" + errorMessage);
                }
            } catch (NumberFormatException e) {
                System.out.println("\n" + errorMessage);
            }
        }
    }
}
