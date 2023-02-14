package bitcamp.myapp.vo;

public class Teacher extends Member implements java.io.Serializable {
  private static final long serialVersionUID = 1L;

  private String email;
  private int degree;
  private String school;
  private String major;
  private int wage;


  @Override
  public String toString() {
    return "Teacher [email=" + email + ", degree=" + degree + ", school=" + school + ", major="
        + major + ", wage=" + wage + ", getNo()=" + getNo() + ", getName()=" + getName()
        + ", getTel()=" + getTel() + ", getCreatedDate()=" + getCreatedDate() + "]";
  }

  @Override
  public String getEmail() {
    return email;
  }
  @Override
  public void setEmail(String email) {
    this.email = email;
  }
  public int getDegree() {
    return degree;
  }
  public void setDegree(int degree) {
    this.degree = degree;
  }
  public String getSchool() {
    return school;
  }
  public void setSchool(String school) {
    this.school = school;
  }
  public String getMajor() {
    return major;
  }
  public void setMajor(String major) {
    this.major = major;
  }
  public int getWage() {
    return wage;
  }
  public void setWage(int wage) {
    this.wage = wage;
  }

}
