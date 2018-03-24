package Service;

import Database.Database;
import Models.Patient;
import Models.Physician;

import java.util.ArrayList;
import java.util.List;

public class Service {

    private Database database;

    public Service(){

        database = new Database();
    }

    public String checkPatient(String code){
        String cnp = "null";
        List<Patient> patients = database.getPatients();
        for(Patient patient: patients){
            if(patient.getCode().equals(code)){
                cnp = patient.getCnp().substring(9, 12);
            }
        }
        return cnp;
    }
}
