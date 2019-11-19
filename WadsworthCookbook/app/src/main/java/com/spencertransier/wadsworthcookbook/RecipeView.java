package com.spencertransier.wadsworthcookbook;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import com.google.gson.Gson;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class RecipeView extends AppCompatActivity {

    public TextView textViewName;
    public TextView textViewCategory;
    public TextView textViewAuthor;
    public TextView textViewIngredientCount;
    public TextView textViewJSONResults;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecipeModel recipeModel = new RecipeModel();
        RecipeView recipeView = new RecipeView();
        RecipeController controller = new RecipeController(recipeModel, recipeView);

        controller.setRecipeName("French Toast");
        controller.setRecipeCategory("Breakfast");
        controller.setRecipeAuthor("Rachel Wadsworth");
        controller.setRecipeIngredientCount(18);

        textViewName = findViewById(R.id.recipeNameTextView);
        textViewName.setText("Name: " + controller.getRecipeName());

        textViewCategory = findViewById(R.id.recipeCategoryTextView);
        textViewCategory.setText("Category: " + controller.getRecipeCategory());

        textViewAuthor = findViewById(R.id.recipeAuthorTextView);
        textViewAuthor.setText("Author: " + controller.getRecipeAuthor());

        textViewIngredientCount = findViewById(R.id.recipeIngredientCountTextView);
        textViewIngredientCount.setText("Ingredient Count: " + controller.getRecipeIngredientCount());

        // JSON & HTTPUrlConnection

        // Create new recipe object
        RecipeModel recipe = new RecipeModel(
                "Stir Fry",
                "Dinner",
                "Louise Wadsworth",
                14
        );

        // Convert object to JSON
        Gson gson = new Gson();
        String jsonRecipe = gson.toJson(recipe);

        // Display recipe object as string of JSON
        textViewJSONResults = findViewById(R.id.JSONResultsTextView);
        textViewJSONResults.setText("\nRecipe object to JSON: " + jsonRecipe);

        // Pull down JSON content from localhost server
        String jsonURL = "http://localhost:8080/recipeData.json";

        RecipeModel jsonResult = null;

        try {
            // Create URL object
            URL url = new URL(jsonURL);

            // Create HttpURLConnection
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            // Read the contents of the connection into the buffer
            BufferedReader jsonReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            String jsonLine;

            StringBuffer jsonResponse = new StringBuffer();

            while ((jsonLine = jsonReader.readLine()) != null) {
                jsonResponse.append(jsonLine);
            }

            // Close reader
            jsonReader.close();

            // Use GSON to translate JSON into RecipeModel object
            jsonResult = gson.fromJson(jsonLine, RecipeModel.class);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Display contents of JSON file
        textViewJSONResults.append("\n\nJSON to recipe object: " + jsonResult);
    }
}
