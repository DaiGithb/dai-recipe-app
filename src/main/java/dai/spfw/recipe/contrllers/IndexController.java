package dai.spfw.recipe.contrllers;

import dai.spfw.recipe.domain.Recipe;
import dai.spfw.recipe.repo.CategoryRepo;
import dai.spfw.recipe.repo.RecipeRepo;
import dai.spfw.recipe.repo.UnitOfMsRepo;
import dai.spfw.recipe.services.RecipeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Set;

@Controller
public class IndexController {

//    private final CategoryRepo categoryRepo;
//    private final UnitOfMsRepo unitOfMsRepo;
    private final RecipeService recipeService;

    public IndexController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @RequestMapping({"", "/", "index", "index.html"})
    public String getIndexPage(Model model){
//        String desc = "American";
//        Optional<Category> co = categoryRepo.findByDescription(desc);
//        System.out.println("Data from Category: " +
//                (co.isPresent() ? co.get().getId() : "no data returned."));

        Set<Recipe> set = recipeService.getRecipes();
        model.addAttribute("recipes", set);
        return "index";
    }

}
