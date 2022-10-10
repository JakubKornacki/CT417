package org.example;

import org.joda.time.DateTime;
import org.terasoluna.gfw.common.*;

import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private DateTime dateOfBirth;
    private int age;
    private String userName;
    private CourseProgramme course;
    private ArrayList<Module> modules = new ArrayList<Module>();

    public Student(int id, String name, DateTime dateOfBirth, int age, String userName, CourseProgramme course, ArrayList<Module> modules) {
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.age = age;
        this.userName = userName;
        this.course = course;
        this.modules = modules;
    }

    public Student() {

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUserName() {
        return userName + " " + age;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public CourseProgramme getCourse() {
        return course;
    }

    public void setCourse(CourseProgramme course) {
        this.course = course;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }
}
