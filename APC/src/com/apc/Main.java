package com.apc;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        // Create new instance of the Application Controller so that the commands can be passed there
        ApplicationController applicationController = new ApplicationController();
        // Create a new scanner to accept user input
        Scanner scanner = new Scanner(System.in);
        // Create a new instance of Cookbook so the data can be passed there
        Cookbook cookbook = new Cookbook();

        try {
            int action = -1;
            // Switch statement based on which number the user inputs
            while (action != 0) {
                // Take whatever the user enters and run it through the switch statement
                action = (int)applicationController.doCommand("displayMenu", GetCommandData("scanner", scanner));
                switch (action) {
                    // If 1, send the "displayRecipes" command to the application controller so that the displayRecipes handler can be called
                    case 1:
                        applicationController.doCommand("displayRecipes", GetCommandData("cookbook", cookbook));
                        break;
                    // If 2, send the "createRecipe" command to the application controller so that the displayRecipes handler can be called
                    // The scanner will be sent as well because the user's input will be added as a new recipe
                    case 2:
                        HashMap<String, Object> commandData = GetCommandData("scanner", scanner);
                        commandData.put("cookbook", cookbook);
                        applicationController.doCommand("createRecipe", commandData);
                        break;
                    // If 0, the program ends
                    case 0:
                        System.out.println("Thank you for using Wadsworth Cookbook");
                        break;
                    // If anything else, prompt the user to give another input
                    default:
                        System.out.println("Unrecognized selection, please try again.");
                        break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        // Close the scanner properly after it is done
        finally {
            scanner.close();
        }
    }

    public static HashMap<String, Object> GetCommandData(String key, Object value) {
        HashMap<String, Object> data = new HashMap<String, Object>();
        data.put(key, value);
        return data;
    }
}
