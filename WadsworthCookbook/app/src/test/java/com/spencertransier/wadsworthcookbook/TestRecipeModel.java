package com.spencertransier.wadsworthcookbook;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class TestRecipeModel {

    @Test
    public void testAssertArrayEquals() {
        RecipeModel recipeModel = new RecipeModel("Frito Pie", "Dinner", "Talitha Nanther", 13);

        String[] testArray1 = {recipeModel.getName(), recipeModel.getCategory(), recipeModel.getAuthor()};
        String[] testArray2 = {recipeModel.getName(), recipeModel.getCategory(), recipeModel.getAuthor()};

        // Validate that the contents of the two arrays are the same
        assertArrayEquals(testArray1, testArray2);
    }

    @Test
    public void testAssertEquals() {
        RecipeModel recipeModel = new RecipeModel("Chicken Burrito", "Dinner", "Alisha Stewart", 11);

        String expectedName = "Chicken Burrito";

        // Validate that the value of the String expected name is the same as the value extracted from the object
        assertEquals(expectedName, recipeModel.getName());
    }

    @Test
    public void testAssertFalse() {
        RecipeModel recipeModel = new RecipeModel("Chicken Lime Enchiladas", "Dinner", "Rachel James", 14);

        // Validate that the value extracted from the object is not the same as the string
        assertFalse(recipeModel.getName() == "Steak and Eggs");
    }

    @Test
    public void testAssertNotNull() {
        RecipeModel recipeModel = new RecipeModel("Hamburgers", "Lunch", "Hyrum Davis", 8);

        // Validate that the object value is not null
        assertNotNull(recipeModel.getAuthor());
    }

    @Test
    public void testAssertNotSame() {
        RecipeModel recipeModel = new RecipeModel("Margarita Pizza", "Lunch", "James Gordon", 8);

        String testString1 = recipeModel.getCategory();
        String testString2 = recipeModel.getName();

        // Validate that the two strings are not the same
        assertNotSame(testString1, testString2);
    }

    @Test
    public void testAssertNull() {
        RecipeModel recipeModel = new RecipeModel("Pancakes", null, "Brenda Sonders", 4);

        // Validate that the object value is null
        assertNull(recipeModel.getCategory());
    }

    @Test
    public void testAssertSame() {
        RecipeModel recipeModel = new RecipeModel("Pork Chops", "Dinner", "Kenneth Washington", 5);

        String testString1 = recipeModel.getAuthor();
        String testString2 = recipeModel.getAuthor();

        // Validate that the two strings are the same
        assertSame(testString1, testString2);
    }

    @Test
    public void testAssertThat() {
        RecipeModel recipeModel = new RecipeModel("Spaghetti", "Dinner", "Rachel James", 3);

        Integer expectedIngredientCount = 3;

        // Validate that the value extracted from the object is the same as the provided integer
        assertThat(recipeModel.getIngredientCount(), is(expectedIngredientCount));
    }

    @Test
    public void testAssertTrue() {
        RecipeModel recipeModel = new RecipeModel("Fish Tacos", "Dinner", "Louise Pickett", 9);

        // Validate that the boolean is true
        assertTrue(recipeModel.getAuthor() == "Louise Pickett");
    }
}
