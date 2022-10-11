package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class ModuleTest {

    @Test
    void getModuleName() {
        Module module = new Module();
        module.setModuleName("CT417");
        assertTrue(module.getModuleName().equals("CT417"));
    }

    @Test
    void setModuleName() {
        Module module = new Module();
        module.setModuleName("CT417");
        assertTrue(module.getModuleName().equals("CT417"));
    }

    @Test
    void getStudents() {
        Module module = new Module();
        ArrayList<Student> students = new ArrayList<Student>();
        module.setStudents(students);
        assertTrue(module.getStudents().equals(students));
    }

    @Test
    void setStudents() {
        Module module = new Module();
        ArrayList<Student> students = new ArrayList<Student>();
        module.setStudents(students);
        assertTrue(module.getStudents().equals(students));
    }

    @Test
    void getAssociatedCourses() {
        Module module = new Module();
        ArrayList<CourseProgramme> courses = new ArrayList<CourseProgramme>();
        module.setAssociatedCourses(courses);
        assertTrue(module.getAssociatedCourses().equals(courses));
    }

    @Test
    void setAssociatedCourses() {
        Module module = new Module();
        ArrayList<CourseProgramme> courses = new ArrayList<CourseProgramme>();
        module.setAssociatedCourses(courses);
        assertTrue(module.getAssociatedCourses().equals(courses));
    }

    @Test
    void getLecturer() {
        Module module = new Module();
        Lecturer lecturer = new Lecturer();
        module.setLecturer(lecturer);
        assertTrue(module.getLecturer().equals(lecturer));
    }

    @Test
    void setLecturer() {
        Module module = new Module();
        Lecturer lecturer = new Lecturer();
        module.setLecturer(lecturer);
        assertTrue(module.getLecturer().equals(lecturer));
    }
}