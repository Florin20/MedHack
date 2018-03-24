package Database;

import Models.MedicalFile;
import Models.Patient;
import Models.Physician;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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

    public void test(){
        ArrayList<String> recommendations = new ArrayList<String>();
        recommendations = (ArrayList<String>) Arrays.asList(new String[]{"rec1","rec2","rec3","rec4"});
        MedicalFile medicalFile1 = new MedicalFile("diagnostic1",recommendations,"2018-03-24","1");
        MedicalFile medicalFile2 = new MedicalFile("diagnostic1",recommendations,"2018-03-24","1");
        MedicalFile medicalFile3 = new MedicalFile("diagnostic1",recommendations,"2018-03-24","2");


        patients.add(new Patient(1,"Dora","Dumitrascu",21,"address1",medicalFile1));
        patients.add(new Patient(2,"Florin","Bologheanu",21,"address2",medicalFile2));
        patients.add(new Patient(3,"Silvana","Man",21,"address3",medicalFile3));

        physicians.add(new Physician(1,"Doctor","1","Oncologist","sign1"));
        physicians.add(new Physician(2,"Doctor","2","Oncologist","sign2"));
    }
}
