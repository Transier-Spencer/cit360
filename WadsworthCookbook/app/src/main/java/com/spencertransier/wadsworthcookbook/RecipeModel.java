package com.spencertransier.wadsworthcookbook;

public class RecipeModel {

    // Create Variables - Recipe Name and Recipe Category
    private String recipeName;
    private String recipeCategory;
    private String recipeAuthor;
    private Integer recipeIngredientCount;

    public RecipeModel() {

    }

    public RecipeModel(String recipeName, String recipeCategory, String recipeAuthor, Integer recipeIngredientCount) {
        this.recipeName = recipeName;
        this.recipeCategory = recipeCategory;
        this.recipeAuthor = recipeAuthor;
        this.recipeIngredientCount = recipeIngredientCount;
    }

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

    // Getter - Recipe Author
    public String getAuthor() {
        return recipeAuthor;
    }

    // Setter - Recipe Author
    public void setAuthor(String recipeAuthor) {
        this.recipeAuthor = recipeAuthor;
    }

    // Getter - Recipe Ingredient Count
    public Integer getIngredientCount() {
        return recipeIngredientCount;
    }

    // Setter - Recipe Ingredient Count
    public void setIngredientCount(Integer recipeIngredientCount) {
        this.recipeIngredientCount = recipeIngredientCount;
    }
}
