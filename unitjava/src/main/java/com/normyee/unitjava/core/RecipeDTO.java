package com.normyee.unitjava.core;

public class RecipeDTO {
    private Long _id;
    private String _name;
    private String[] _ingredients;

    public RecipeDTO(Long id, String name, String[] ingredients) {
        this._id = id;
        this._name = name;
        this._ingredients = ingredients;
    }

    public String getName() {
        return _name;
    }

    public void setName(String _name) {
        this._name = _name;
    }

    public String[] getIngredients() {
        return _ingredients;
    }

    public void setIngredients(String[] _ingredients) {
        this._ingredients = _ingredients;
    }

    public Long getId() {
        return _id;
    }

    public void setId(Long _id) {
        this._id = _id;
    }


}
