package Models;

public class Physician {
    private Integer code;
    private String firstname;
    private String lastname;
    private String specialization;
    private String signature;

    public Physician(){}

    public Physician(Integer code, String firstname, String lastname, String specialization, String signature) {
        this.code = code;
        this.firstname = firstname;
        this.lastname = lastname;
        this.specialization = specialization;
        this.signature = signature;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
}
