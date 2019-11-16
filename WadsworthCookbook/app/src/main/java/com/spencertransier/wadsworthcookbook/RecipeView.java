package com.spencertransier.wadsworthcookbook;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RecipeView extends AppCompatActivity {

    public TextView textViewName;
    public TextView textViewCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecipeView recipeView = new RecipeView();
        RecipeModel recipeModel = retrieveRecipeFromModel();
        RecipeController recipeController = new RecipeController(recipeModel, recipeView);

        textViewName = findViewById(R.id.recipeNameTextView);
        textViewName.setText("Name: "+retrieveRecipeFromModel().getName());

        textViewCategory = findViewById(R.id.recipeCategoryTextView);
        textViewCategory.setText("Category: "+retrieveRecipeFromModel().getCategory());
    }

    private RecipeModel retrieveRecipeFromModel() {
        RecipeModel recipe = new RecipeModel();
        recipe.setName("French Toast");
        recipe.setCategory("Breakfast");
        return recipe;
    }
}
