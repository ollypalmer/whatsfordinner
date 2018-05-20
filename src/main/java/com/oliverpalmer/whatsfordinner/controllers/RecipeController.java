package com.oliverpalmer.whatsfordinner.controllers;

import com.oliverpalmer.whatsfordinner.models.Recipe;
import com.oliverpalmer.whatsfordinner.services.RecipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by oliver on 13/10/17.
 */
@RestController
public class RecipeController {

    private RecipeService recipeService;

    @Autowired
    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @CrossOrigin
    @RequestMapping(value = "/recipes", method = RequestMethod.GET)
    public List<Recipe> getRecipes() {
        return recipeService.getAll();
    }

    @CrossOrigin
    @RequestMapping(value = "/recipe/{id}", method = RequestMethod.GET)
    public Recipe get(@PathVariable(value = "id") String id) {
        return recipeService.get(id);
    }

    @CrossOrigin
    @RequestMapping(value = "/recipe", method = RequestMethod.POST)
    public Recipe add(@RequestBody Recipe recipe) {
        return recipeService.add(recipe);
    }

    @CrossOrigin
    @RequestMapping(value = "/recipe", method = RequestMethod.PUT)
    public Recipe update(@RequestBody Recipe recipe) {
        return recipeService.update(recipe);
    }

    @CrossOrigin
    @RequestMapping(value = "/recipe/{id}", method = RequestMethod.DELETE)
    public void deleteRecipe(@PathVariable(value = "id") String id) {
        recipeService.delete(id);
    }
}
