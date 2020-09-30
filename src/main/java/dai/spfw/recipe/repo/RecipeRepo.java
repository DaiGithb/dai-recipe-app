package dai.spfw.recipe.repo;

import dai.spfw.recipe.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

public interface RecipeRepo extends CrudRepository<Recipe, Long> {
}
