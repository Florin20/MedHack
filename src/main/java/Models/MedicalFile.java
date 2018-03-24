package Models;

import java.util.List;

public class MedicalFile {

    private String diagnostic;
    private List<String> recommendations;
    private String medicalFileDate;
    private String responsiblePhysician;

    public MedicalFile(String diagnostic, List<String> recommendations, String medicalFileDate, String responsiblePhysician){
        this.diagnostic = diagnostic;
        this.recommendations = recommendations;
        this.medicalFileDate = medicalFileDate;
        this.responsiblePhysician = responsiblePhysician;
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
}
