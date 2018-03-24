package Controller;

import Models.CData;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class MyController {

    @RequestMapping(path={"/s"}, method= RequestMethod.GET)
    public String handle(Model model) {
        return "index";
    }

}