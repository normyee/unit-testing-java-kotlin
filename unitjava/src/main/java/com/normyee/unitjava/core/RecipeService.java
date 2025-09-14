package com.normyee.unitjava.core;

public class RecipeService {
    private final IRecipeRepository _recipeRepository;
    public RecipeService(IRecipeRepository recipeRepository ) {
        this._recipeRepository = recipeRepository;
    }

    public RecipeDTO create(RecipeDTO dto) {
        var createdRecipe = this._recipeRepository.create(dto);

        return new RecipeDTO(createdRecipe.getId(), createdRecipe.getName(), createdRecipe.getIngredients());
    }
}
