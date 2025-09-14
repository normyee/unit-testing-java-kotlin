package com.normyee.unitjava.core;

public class RecipeEntity {
    private Long _id;
    private String _name;
    private String[] _ingredients;


    public RecipeEntity(Long id, String name, String[] ingredients ) {
        this._id = id;
        this._name = name;
        this._ingredients = ingredients;
    }

    public Long getId() {
        return _id;
    }

    public String getName() {
        return _name;
    }

    public String[] getIngredients() {
        return _ingredients;
    }

    public void setId(Long id) {
        this._id = id;
    }

    public void setName(String name) {
        this._name = name;
    }

    public void setIngredients(String[] ingredients) {
        this._ingredients = ingredients;
    }
}
