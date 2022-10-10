package org.example;

import org.joda.time.DateTime;

import java.util.ArrayList;
import java.util.Date;

public class CourseProgramme {
    private String courseName;
    private ArrayList<Module> listOfModules = new ArrayList<Module>();
    private ArrayList<Student> listOfStudents = new ArrayList<Student>();
    private DateTime academicStartDate;
    private DateTime academicEndDate;

    public CourseProgramme(String courseName, ArrayList<Module> listOfModules, ArrayList<Student> listOfStudents, DateTime academicStartDate, DateTime academicEndDate) {
        this.courseName = courseName;
        this.listOfModules = listOfModules;
        this.listOfStudents = listOfStudents;
        this.academicStartDate = academicStartDate;
        this.academicEndDate = academicEndDate;
    }

    public CourseProgramme(){

    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<Module> getListOfModules() {
        return listOfModules;
    }

    public void setListOfModules(ArrayList<Module> listOfModules) {
        this.listOfModules = listOfModules;
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(ArrayList<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }

    public DateTime getAcademicStartDate() {
        return academicStartDate;
    }

    public void setAcademicStartDate(DateTime academicStartDate) {
        this.academicStartDate = academicStartDate;
    }

    public DateTime getAcademicEndDate() {
        return academicEndDate;
    }

    public void setAcademicEndDate(DateTime academicEndDate) {
        this.academicEndDate = academicEndDate;
    }
}
