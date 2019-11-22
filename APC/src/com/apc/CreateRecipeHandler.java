package com.apc;

import java.util.HashMap;
import java.util.Scanner;

public class CreateRecipeHandler implements Handler {

    @Override
    public Object handleIt(HashMap<String, Object> recipeData) {
        // Create a scanner to get the new recipe name and category from the user
        Scanner scanner = (Scanner) recipeData.get("scanner");
        // Create a new cookbook instance so that the user input can be stored with the other recipes
        Cookbook cookbook = (Cookbook) recipeData.get("cookbook");

        // Prompt the user to enter a recipe name and category
        System.out.print("Enter a recipe name: ");
        String recipeName = scanner.nextLine();
        System.out.print("Enter a recipe category: ");
        String recipeCategory = scanner.nextLine();

        // Create new recipe object with the user input
        Recipe recipe = new Recipe(recipeName, recipeCategory);
        // Pass that object to the create recipe method to have it be stored in the cookbook
        cookbook.createRecipe(recipe);
        return null;
    }
}