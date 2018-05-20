package com.oliverpalmer.whatsfordinner.services;

import com.oliverpalmer.whatsfordinner.models.Ingredient;
import com.oliverpalmer.whatsfordinner.models.Recipe;
import com.oliverpalmer.whatsfordinner.repositories.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/**
 * Created by oliver on 13/10/17.
 */
@Service
public class RecipeService {

    private RecipeRepository recipeRepository;

    @Autowired
    public RecipeService(RecipeRepository recipeRepository) {
        /*Recipe r = new Recipe(
                UUID.randomUUID().toString(),
                "beef pie",
                new ArrayList<>(Arrays.asList(new Ingredient("bouf", 400, "kg"))),
                new ArrayList<>(Arrays.asList("Cook bouf", "profit"))
        );
        Recipe r2 = new Recipe(
                UUID.randomUUID().toString(),
                "cat stew",
                new ArrayList<>(Arrays.asList(new Ingredient("bouf", 400, "kg"))),
                new ArrayList<>(Arrays.asList("Cook bouf", "profit"))
        );*/
        this.recipeRepository = recipeRepository;
        //this.recipeRepository.save(r);
        //this.recipeRepository.save(r2);
    }

    public List<Recipe> getAll() {
        return recipeRepository.findAll();
    }

    public Recipe get(String id) {
        return recipeRepository.findOne(id);
    }

    public Recipe add(Recipe recipe) {
        recipe.setId(UUID.randomUUID().toString());
        return recipeRepository.save(recipe);
    }

    public Recipe update(Recipe recipe) {
        return recipeRepository.save(recipe);
    }

    public void delete(String id) {
        recipeRepository.delete(id);
    }
}
