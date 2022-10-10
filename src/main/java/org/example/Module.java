package org.example;

import java.util.ArrayList;

public class Module {
    private String moduleName;
    private ArrayList<Student> students = new ArrayList<Student>();
    private ArrayList<CourseProgramme> associatedCourses = new ArrayList<CourseProgramme>();
    private Lecturer lecturer;

    public Module(String moduleName, ArrayList<Student> students, ArrayList<CourseProgramme> associatedCourses, Lecturer lecturer) {
        this.moduleName = moduleName;
        this.students = students;
        this.associatedCourses = associatedCourses;
        this.lecturer = lecturer;
    }

    public Module() {

    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<CourseProgramme> getAssociatedCourses() {
        return associatedCourses;
    }

    public void setAssociatedCourses(ArrayList<CourseProgramme> associatedCourses) {
        this.associatedCourses = associatedCourses;
    }

    public Lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}
