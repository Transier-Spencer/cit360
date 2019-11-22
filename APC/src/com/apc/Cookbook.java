package com.apc;

import java.util.ArrayList;

public class Cookbook {

    // Create new array list to store recipes
    private ArrayList<Recipe> recipes;

    public Cookbook() {
        // Create new instance of recipe array list
        recipes = new ArrayList<>();

        // Add initial set of recipes to array list
        recipes.add(new Recipe("French Toast", "Breakfast"));
        recipes.add(new Recipe("Green Eggs and Ham", "Breakfast"));
        recipes.add(new Recipe("California Rolls", "Dinner"));
    }

    // Method for adding a new recipe to the list
    public void createRecipe(Recipe recipe) {
        this.recipes.add(recipe);
    }

    // Build a new string from all the recipes in the list and pass it back to be displayed to the user
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Cookbook\n");
        ArrayList<String> recipeList = new ArrayList<>();
        // Loop through each recipe in the ArrayList and add it to the larger string
        for(Recipe recipe : recipes) {
            recipeList.add(recipe.toString());
        }
        String recipeStrings = String.join("\n", recipeList);
        builder.append(recipeStrings);
        builder.append("\n");
        return builder.toString();
    }
}

