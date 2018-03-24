package Models;

public class Recommendation {
    private String diet;
    private String treatment;
    private String other;

    public Recommendation(String diet, String treatment, String other) {
        this.diet = diet;
        this.treatment = treatment;
        this.other = other;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }
}
