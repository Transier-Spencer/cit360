package com.apc;

import java.util.HashMap;
import java.util.Scanner;

public class DisplayMenuHandler implements Handler {

    public DisplayMenuHandler() {
    }

    @Override
    public Object handleIt(HashMap<String, Object> recipeData) {
        // Provide the initial menu for the user to interact with
        System.out.println("Menu:");
        System.out.println("\t1-Display Recipes");
        System.out.println("\t2-Create Recipe");
        System.out.println("\t0-Exit");
        System.out.print("Selection (1, 2, or 0): ");

        Scanner scanner = (Scanner) recipeData.get("scanner");
        int selection = GetNextInt(scanner);
        return selection;
    }

    // This is the scanner for getting input from the user and working through the options in Main.java
    private int GetNextInt (Scanner scanner) {
        String input = scanner.nextLine();
        try {
            int result = Integer.parseInt(input);
            return result;
        } catch (Exception e) {
            System.out.println("You must enter a number from the menu.");
            return -1;
        }
    }
}