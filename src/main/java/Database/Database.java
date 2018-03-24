package Database;

import Models.Patient;
import Models.Physician;

import java.util.List;

public class Database {
    private List<Patient> patients;
    private List<Physician> physicians;

    public Database(List<Patient> patients, List<Physician> physicians) {
        this.patients = patients;
        this.physicians = physicians;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public List<Physician> getPhysicians() {
        return physicians;
    }

    public void setPatients(List<Patient> patients) {
        this.patients = patients;
    }

    public void setPhysicians(List<Physician> physicians) {
        this.physicians = physicians;
    }
}
