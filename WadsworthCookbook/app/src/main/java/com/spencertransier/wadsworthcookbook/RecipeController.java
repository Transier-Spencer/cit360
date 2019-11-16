package com.spencertransier.wadsworthcookbook;

public class RecipeController {

    private RecipeModel recipeModel;
    private RecipeView recipeView;

    public RecipeController(RecipeModel recipeModel, RecipeView recipeView) {
            this.recipeModel = recipeModel;
            this.recipeView = recipeView;
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
}
