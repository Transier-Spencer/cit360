package com.apc;

import java.util.HashMap;

public class DisplayRecipesHandler implements Handler {

    @Override
    public Object handleIt(HashMap<String, Object> recipeData) {
        // Retrieve the cookbook data
        Cookbook cookbook = (Cookbook) recipeData.get("cookbook");

        // Get the toString cookbook method
        String s = cookbook.toString();
        // Print the data returned from cookbook, which is a list of all recipes and their categories
        System.out.println(s);
        return null;
    }

}

