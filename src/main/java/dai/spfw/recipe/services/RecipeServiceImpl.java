package dai.spfw.recipe.services;

import dai.spfw.recipe.domain.Recipe;
import dai.spfw.recipe.repo.RecipeRepo;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class RecipeServiceImpl implements RecipeService {

    private final RecipeRepo recipeRepo;

    public RecipeServiceImpl(RecipeRepo recipeRepo) {
        this.recipeRepo = recipeRepo;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> rcpSet = new HashSet<>();
        recipeRepo.findAll().iterator().forEachRemaining(r -> rcpSet.add(r));
        //recipeRepo.findAll().iterator().forEachRemaining(rcpSet::add);
        return rcpSet;
    }

    @Override
    public Set<Recipe> findAll() {
        return null;
    }

    @Override
    public Recipe findById(Long id) {
        return null;
    }

    @Override
    public Recipe save(Recipe obj) {
        return null;
    }

    @Override
    public void delete(Recipe obj) {

    }

    @Override
    public void deleteById(Long id) {

    }
}
