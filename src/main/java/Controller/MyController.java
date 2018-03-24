package Controller;

import Models.Physician;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import Database.Database;
import Service.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyController {

    Service service = new Service();

    @RequestMapping(path={"/login"}, method= RequestMethod.GET)
    public String handle(Model model) {


        return "login";
    }
    @RequestMapping(path={"/loginPage"}, method = RequestMethod.POST)
    public String loginPage(Model model, @RequestParam String type,  @RequestParam String code){
        String cnp = service.checkPatient(code);
        if("null".equals(cnp)){
            return "error-invalid";
        }
        else{
            model.addAttribute("code", code);
            return "cnp-validation";
        }
    }

    @RequestMapping(path={"/checkIdNumber/{code}"}, method = RequestMethod.POST)
    public String idNumber(Model model, @RequestParam String cnp, @PathVariable("code") String code){
        String returnView = "error-invalid";
        String correctCnp = service.checkPatient(code);
        if(correctCnp.equals(cnp))
            returnView = "home";

        return returnView;

    }




}