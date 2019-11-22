package com.apc;

public class Recipe {

    // Create class properties
    private String recipeName;
    private String recipeCategory;

    // Class constructor
    public Recipe(String recipeName, String recipeCategory) {
        this.recipeName = recipeName;
        this.recipeCategory = recipeCategory;
    }

    // Getter - Recipe Name
    public String getRecipeName() {
        return recipeName;
    }

    // Setter - Recipe Name
    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }

    // Getter - Recipe Category
    public String getRecipeCategory() {
        return recipeCategory;
    }

    // Setter - Recipe Category
    public void setRecipeCategory(String recipeCategory) {
        this.recipeCategory = recipeCategory;
    }

    // Override method for printing out contents of recipe object
    @Override
    public String toString() {
        return "Name: " + recipeName + "\n\tCategory: " + recipeCategory + "\n";
    }
}