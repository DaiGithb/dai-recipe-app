package dai.spfw.recipe.services;

import dai.spfw.recipe.domain.Recipe;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Set<Recipe> findAll();

    Recipe findById(Long id);

    Recipe save(Recipe obj);

    void delete(Recipe obj);

    void deleteById(Long id);

}
