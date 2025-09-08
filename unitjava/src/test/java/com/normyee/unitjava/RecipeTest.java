package com.normyee.unitjava;

import com.normyee.unitjava.core.RecipeService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RecipeTest {
   private final RecipeService _recipeService = new RecipeService();

    @Test
    @DisplayName("it should create a new recipe and not be null")
    public void createRecipeTest() {
        var recipe = this._recipeService.create();
        Assertions.assertNotNull(recipe);
    }
}
