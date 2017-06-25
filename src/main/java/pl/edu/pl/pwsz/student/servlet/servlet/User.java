package pl.edu.pl.pwsz.student.servlet.servlet;

import org.hsqldb.lib.StringUtil;

/**
 * Created by Student on 2017-03-07.
 */
public class User {
    private String name;
    private String lastname;
    private Integer YearofBirth;
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getYearofbirth() {
        return yearofbirth;
    }

    public void setYearofbirth(Integer yearofbirth) {
        this.yearofbirth = yearofbirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setYearOfbirth(int yearOfbirth) {
        this.yearOfbirth = yearOfbirth;
    }
}
