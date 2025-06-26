package org.example;

import org.example.InputValidator;

public class App {
    public static void main(String[] args) {
        int lower = 1;
        int upper = 100;
        int defaultVal = 45;

        int result = InputValidator.getValidatedInput(
            lower,
            upper,
            "Please enter a value",
            "Your value is invalid",
            defaultVal
        );

        System.out.println("\nThe value chosen by the user is " + result);
    }
}
