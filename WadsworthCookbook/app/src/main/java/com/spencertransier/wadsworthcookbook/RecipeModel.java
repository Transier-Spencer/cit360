package com.spencertransier.wadsworthcookbook;

public class RecipeModel {

    // Create Variables - Recipe Name and Recipe Category
    private String recipeName;
    private String recipeCategory;

    // Getter - Recipe Name
    public String getName() {
        return recipeName;
    }

    // Setter - Recipe Name
    public void setName(String recipeName) {
        this.recipeName = recipeName;
    }

    // Getter - Recipe Category
    public String getCategory() {
        return recipeCategory;
    }

    // Setter - Recipe Category
    public void setCategory(String recipeCategory) {
        this.recipeCategory = recipeCategory;
    }
}
