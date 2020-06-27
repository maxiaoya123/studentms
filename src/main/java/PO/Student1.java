package PO;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="student1")
public class Student1 {
    private int sid;
    private String pwd;
    private String name;
    private String sex;
    private String birthday;
    private String grade;
    private String major;
    private String department;
    @Id
    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }
    /* public Student(String pwd, String name, String sex, String grade){
          this.sid=sid;
          this.birthday=birthday;
          this.department=department;
          this.grade=grade;
          this.major=major;
          this.name=name;
          this.pwd=pwd;
          this.sex=sex;
     }*/
    @Basic
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    //@Override
   /* public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", pwd='" + pwd + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", birthday=" + birthday +
                ", grade='" + grade + '\'' +
                ", major='" + major + '\'' +
                ", department='" + department + '\'' +
                '}';
    }*/

    /*public Student(){
        }*/
}


