package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyController {

    @RequestMapping(path={"/login"}, method= RequestMethod.GET)
    public String handle(Model model, @RequestParam String code) {
        
        return "login";
    }

}