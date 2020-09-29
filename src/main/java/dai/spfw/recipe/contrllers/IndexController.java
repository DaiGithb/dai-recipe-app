package dai.spfw.recipe.contrllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/", "index", "index.html"})
    public String getIndexPage(){
        String str = "asddddddsAAAAQQQQ";
        return "index";
    }

}
