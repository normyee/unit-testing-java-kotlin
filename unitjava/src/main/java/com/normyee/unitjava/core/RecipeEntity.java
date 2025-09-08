package com.normyee.unitjava.core;

public class RecipeEntity {
    private Integer _id;
    private String _name;
    private String[] _ingredients;
    public Integer getId() {
        return _id;
    }

    public String getName() {
        return _name;
    }

    public String[] getIngredients() {
        return _ingredients;
    }

    public void setId(Integer id) {
        this._id = id;
    }

    public void setName(String name) {
        this._name = name;
    }

    public void setIngredients(String[] ingredients) {
        this._ingredients = ingredients;
    }
}
