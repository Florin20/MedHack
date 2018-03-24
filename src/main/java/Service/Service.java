package Service;

import Database.Database;
import Models.Patient;
import Models.Physician;

import java.util.ArrayList;
import java.util.List;

public class Service {

    private Database database = new Database();

    public Service(){

    }

    public String checkPatient(String code){
        String cnp = "null";
        List<Patient> patients = database.getPatients();
        for(Patient patient: patients){
            if(patient.getCode() == Integer.valueOf(code)){
                cnp = patient.getCnp().substring(9, 13);
                break;
            }
        }
        return cnp;
    }
}
