package com.normyee.unitjava;

import com.normyee.unitjava.core.RecipeDTO;
import com.normyee.unitjava.core.RecipeService;
import com.normyee.unitjava.fake.RecipeRepositoryFake;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RecipeTest {
   private final RecipeService _recipeService = new RecipeService(new RecipeRepositoryFake());

    @Test
    @DisplayName("it should create a new recipe and not be null")
    public void createRecipeTest() {
        String[] ingredients = {"Tomate", "Extrato de Tomate", "Queijo", "Massa", "Manjericão"};

        RecipeDTO recipe = new RecipeDTO(null, "Pizza", ingredients);

        var recipeCreated = this._recipeService.create(recipe);
        Assertions.assertNotNull(recipeCreated);
        Assertions.assertEquals(1, recipeCreated.getId());
    }
}
