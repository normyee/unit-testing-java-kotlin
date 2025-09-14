package com.normyee.unitjava.fake;

import com.normyee.unitjava.core.IRecipeRepository;
import com.normyee.unitjava.core.RecipeDTO;
import com.normyee.unitjava.core.RecipeEntity;
import java.util.ArrayList;

public class RecipeRepositoryFake implements IRecipeRepository {
    private final ArrayList<RecipeEntity> _recipesData = new ArrayList<>();

    public RecipeEntity create(RecipeDTO dto) {
        long id = (long) this._recipesData.size();
        RecipeEntity newRecipe = new RecipeEntity(id == 0 ? 1 : id, dto.getName(), dto.getIngredients());
        this._recipesData.add(newRecipe);

        return newRecipe;
    }
}
