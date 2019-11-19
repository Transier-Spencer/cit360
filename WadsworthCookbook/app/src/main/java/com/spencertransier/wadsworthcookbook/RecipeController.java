package com.spencertransier.wadsworthcookbook;

public class RecipeController {

    private RecipeModel recipeModel;
    private RecipeView recipeView;

    public RecipeController(RecipeModel recipeModel, RecipeView recipeView) {
        this.recipeModel = recipeModel;
        this.recipeView = recipeView;
    }

    public RecipeController(String recipeName, String recipeCategory, String recipeAuthor, Integer recipeIngredientCount) {
        RecipeModel recipe = new RecipeModel(recipeName, recipeCategory, recipeAuthor, recipeIngredientCount);
    }

    public void setRecipeName(String recipeName) {
        recipeModel.setName(recipeName);
    }

    public String getRecipeName() {
        return recipeModel.getName();
    }

    public void setRecipeCategory(String recipeCategory) {
        recipeModel.setCategory(recipeCategory);
    }

    public String getRecipeCategory() {
        return recipeModel.getCategory();
    }

    public void setRecipeAuthor(String recipeAuthor) {
        recipeModel.setAuthor(recipeAuthor);
    }

    public String getRecipeAuthor() {
        return recipeModel.getAuthor();
    }

    public void setRecipeIngredientCount(Integer recipeIngredientCount) {
        recipeModel.setIngredientCount(recipeIngredientCount);
    }

    public Integer getRecipeIngredientCount() {
        return recipeModel.getIngredientCount();
    }
}
