package dai.spfw.recipe.repo;

import dai.spfw.recipe.domain.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

//@Repository
public interface CategoryRepo  extends CrudRepository<Category, Long> {

    Optional<Category> findByDescription(String desc);

}
