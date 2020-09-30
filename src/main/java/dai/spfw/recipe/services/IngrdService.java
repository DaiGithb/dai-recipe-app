package dai.spfw.recipe.services;

import dai.spfw.recipe.domain.Ingredient;

import java.util.Set;

public interface IngrdService {

    Set<Ingredient> findAll();

    Ingredient findById(Long id);

    Ingredient save(Ingredient obj);

    void delete(Ingredient obj);

    void deleteById(Long id);
}
