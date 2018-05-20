package com.oliverpalmer.whatsfordinner.models;

import org.springframework.data.annotation.Id;

import java.util.List;

/**
 * Created by oliver on 13/10/17.
 */
public class Recipe {

    @Id
    private String id;
    private String name;
    private List<Ingredient> ingredients;
    private List<String> instructions;

    public Recipe() {
        // Default constructor for deserialization
    }

    public Recipe(String id, String name, List<Ingredient> ingredients, List<String> instructions) {
        this.id = id;
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getInstructions() {
        return instructions;
    }

    public void setInstructions(List<String> instructions) {
        this.instructions = instructions;
    }
}
