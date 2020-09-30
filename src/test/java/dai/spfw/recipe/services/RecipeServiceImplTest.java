package dai.spfw.recipe.services;

import dai.spfw.recipe.domain.Recipe;
import dai.spfw.recipe.repo.RecipeRepo;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepo recipeRepo;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepo);
    }

    @Test
    public void getRecipes() {
        Recipe rcp = new Recipe();
        HashSet hs = new HashSet<>();
        hs.add(rcp);

        when(recipeRepo.findAll()).thenReturn(hs);

        Set<Recipe> st = recipeService.getRecipes();
        assertEquals(st.size(), 1);
        verify(recipeRepo, times(1)).findAll();
    }
}