package Controller;

import Models.Patient;
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

import java.util.ArrayList;
import java.util.List;


@Controller
public class MyController {

    Service service = new Service();

    @RequestMapping(path = {"/login"}, method = RequestMethod.GET)
    public String handle(Model model) {
        return "login";
    }

    @RequestMapping(path = {"/loginPage"}, method = RequestMethod.POST)
    public String loginPage(Model model, @RequestParam String type, @RequestParam String code) {
        String returnedView = "error-invalid";
        if(type.equals("Patient")) {
            String cnp = service.checkPatient(code);
            if (! "null".equals(cnp)) {
                model.addAttribute("code", code);
                returnedView = "cnp-validation";
            }
        }
        else {
            List<Patient> patients = service.getDatabase().getPatients();
            List<Patient> newPatients = new ArrayList<Patient>();
            for (Patient p : patients) {
                if (p.getMedicalFile().getResponsiblePhysician().toString().equals(code)) {
                    newPatients.add(p);
                }
            }
            if (newPatients.isEmpty()) {
                return "error-invalid";
            } else {
                model.addAttribute("physicianId", code);
                model.addAttribute("patientList", newPatients);
                returnedView = "physicianPatients";

            }
        }
            return returnedView;

    }

    @RequestMapping(path = {"/checkIdNumber/{code}"}, method = RequestMethod.POST)
    public String idNumber(Model model, @RequestParam String cnp, @PathVariable("code") String code) {
        String returnView = "error-invalid";
        String correctCnp = service.checkPatient(code);
        if (correctCnp.equals(cnp))

            returnView = "home";

        return returnView;

    }

    /*
    return list of all of the patients
     */
    @RequestMapping(path = "/patientList", method = RequestMethod.GET)
    public String getPatientList(Model model) {
        model.addAttribute("myList", service.getDatabase().getPatients());
        return "patientList";
    }

    @RequestMapping(path = "/physicianPatients/{physicianId}", method = RequestMethod.GET)
    public String getPatientForPhysician(Model model, @PathVariable("physicianId") String physicianId){

        List<Patient> patients = service.getDatabase().getPatients();
        List<Patient> newPatients = new ArrayList<Patient>();
        for(Patient p : patients){
            if(p.getMedicalFile().getResponsiblePhysician().toString().equals(physicianId)){
                newPatients.add(p);
            }
        }
        if(newPatients.isEmpty()){
            return "error-invalid";
        }else {
            model.addAttribute("physicianId",physicianId);
            model.addAttribute("patientList", newPatients);
            return "physicianPatients";
        }
    }
}