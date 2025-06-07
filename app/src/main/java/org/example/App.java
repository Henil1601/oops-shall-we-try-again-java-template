package org.example;

import java.util.Scanner;

public class App {

    public int getInput(int lowerBound, int upperBound, String promptMessage, String errorMessage) {
        Scanner scanner = new Scanner(System.in);
        int userInput;

        while (true) {
            System.out.println(promptMessage);
            try {
                userInput = Integer.parseInt(scanner.nextLine());

                if (userInput >= lowerBound && userInput <= upperBound) {
                    return userInput;
                } else {
                    System.out.println(errorMessage);
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: Please enter an integer.");
            }
        }
    }

    public static void main(String[] args) {
        App app = new App();

        int result = app.getInput(1, 100,
                "Please enter a value between 1 and 100:",
                "Your value is invalid, try again.");

        System.out.println("The value chosen by the user is " + result);
    }
}