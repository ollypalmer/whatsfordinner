package com.oliverpalmer.whatsfordinner.repositories;

import com.oliverpalmer.whatsfordinner.models.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by oliver on 14/10/17.
 */
@Repository
public interface RecipeRepository extends MongoRepository<Recipe, String> {
}
