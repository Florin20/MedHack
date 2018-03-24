package Models;

import java.util.List;

public class MedicalFile {

    private String diagnostic;
    private List<String> recommendations;
    private String medicalFileDate;
    private String responsiblePhysician;
    private String admission;
    private String discharge;

    public MedicalFile(String diagnostic, List<String> recommendations, String medicalFileDate, String responsiblePhysician
    ,String hospitalizationStart, String hospitalizationEnd){
        this.diagnostic = diagnostic;
        this.recommendations = recommendations;
        this.medicalFileDate = medicalFileDate;
        this.responsiblePhysician = responsiblePhysician;
        this.admission = hospitalizationStart;
        this.discharge = hospitalizationEnd;
    }

    public void setDiagnostic(String diagnostic){
        this.diagnostic = diagnostic;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public List<String> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(List<String> recommendations) {
        this.recommendations = recommendations;
    }

    public String getMedicalFileDate() {
        return medicalFileDate;
    }

    public void setMedicalFileDate(String medicalFileDate) {
        this.medicalFileDate = medicalFileDate;
    }

    public String getResponsiblePhysician() {
        return responsiblePhysician;
    }

    public void setResponsiblePhysician(String responsiblePhysician) {
        this.responsiblePhysician = responsiblePhysician;
    }

    public String getAdmission(){
        return this.admission;
    }

    public String getDischarge(){
        return this.discharge;
    }

    public void setAdmission(String admission){
        this.admission = admission;
    }

    public void setDischarge(String discharge){
        this.discharge = discharge;
    }
}
