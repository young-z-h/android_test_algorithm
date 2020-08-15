package entity;

public class User {
    private Integer id;
    private String username;
    private String password;
    private School school;
    private Major major;
    private Integer target_region;
    private Double gpa;
    private Double ielts;
    private Integer toefl;
    private Integer college_entrance_examination_fraction;
    private Integer tef;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public Integer getTarget_region() {
        return target_region;
    }

    public void setTarget_region(Integer target_region) {
        this.target_region = target_region;
    }

    public Double getGpa() {
        return gpa;
    }

    public void setGpa(Double gpa) {
        this.gpa = gpa;
    }

    public Double getIelts() {
        return ielts;
    }

    public void setIelts(Double ielts) {
        this.ielts = ielts;
    }

    public Integer getToefl() {
        return toefl;
    }

    public void setToefl(Integer toefl) {
        this.toefl = toefl;
    }

    public Integer getCollege_entrance_examination_fraction() {
        return college_entrance_examination_fraction;
    }

    public void setCollege_entrance_examination_fraction(Integer college_entrance_examination_fraction) {
        this.college_entrance_examination_fraction = college_entrance_examination_fraction;
    }

    public Integer getTef() {
        return tef;
    }

    public void setTef(Integer tef) {
        this.tef = tef;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", school=" + school +
                ", major=" + major +
                ", target_region=" + target_region +
                ", gpa=" + gpa +
                ", ielts=" + ielts +
                ", toefl=" + toefl +
                ", college_entrance_examination_fraction=" + college_entrance_examination_fraction +
                ", tef=" + tef +
                '}';
    }
}
