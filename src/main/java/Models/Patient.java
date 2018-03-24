package Models;

public class Patient {
    private Integer code;
    private String cnp;
    private String firstname;
    private String lastname;
    private Integer age;
    private String address;
    private MedicalFile medicalFile;

    public Patient(){}

    public Patient(Integer code, String cnp, String firstname, String lastname, Integer age, String address, MedicalFile medicalFile) {
        this.code = code;
        this.cnp = cnp;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.address = address;
        this.medicalFile = medicalFile;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public MedicalFile getMedicalFile() {
        return medicalFile;
    }

    public void setMedicalFile(MedicalFile medicalFile) {
        this.medicalFile = medicalFile;
    }

    public String getCnp() {
        return cnp;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "code=" + code +
                ", cnp='" + cnp + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", medicalFile=" + medicalFile +
                '}';
    }
}

