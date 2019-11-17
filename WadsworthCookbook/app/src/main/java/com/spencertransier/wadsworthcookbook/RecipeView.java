package com.spencertransier.wadsworthcookbook;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class RecipeView extends AppCompatActivity {

    public TextView textViewName;
    public TextView textViewCategory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecipeModel recipeModel = new RecipeModel();
        RecipeView recipeView = new RecipeView();
        RecipeController controller = new RecipeController(recipeModel, recipeView);

        controller.setRecipeName("French Toast");
        controller.setRecipeCategory("Breakfast");

        textViewName = findViewById(R.id.recipeNameTextView);
        textViewName.setText("Name: "+ controller.getRecipeName());

        textViewCategory = findViewById(R.id.recipeCategoryTextView);
        textViewCategory.setText("Category: "+ controller.getRecipeCategory());
    }
}
