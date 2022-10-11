package org.example;

import org.checkerframework.checker.units.qual.C;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getId() {
        Student student = new Student();
        student.setId(12345678);
        assertTrue(student.getId() == 12345678);
    }

    @Test
    void setId() {
        Student student = new Student();
        student.setId(12345678);
        assertTrue(student.getId() == 12345678);
    }

    @Test
    void getName() {
        Student student = new Student();
        student.setName("Robert Lynx");
        student.setAge(20);
        assertTrue(student.getName().equals("Robert Lynx 20"));
    }

    @Test
    void setName() {
        Student student = new Student();
        student.setName("Robert Lynx");
        student.setAge(20);
        assertTrue(student.getName().equals("Robert Lynx 20"));
    }

    @Test
    void getDateOfBirth() {
        Student student = new Student();
        DateTime date = new DateTime(2000,10,10,10,10);
        student.setDateOfBirth(date);
        assertTrue(student.getDateOfBirth().equals(date));
    }

    @Test
    void setDateOfBirth() {
        Student student = new Student();
        DateTime date = new DateTime(2000,10,10,10,10);
        student.setDateOfBirth(date);
        assertTrue(student.getDateOfBirth().equals(date));
    }

    @Test
    void getAge() {
        Student student = new Student();
        student.setAge(22);
        assertTrue(student.getAge() == 22);
    }

    @Test
    void setAge() {
        Student student = new Student();
        student.setAge(22);
        assertTrue(student.getAge() == 22);
    }

    @Test
    void getUserName() {
        Student student = new Student();
        student.setUserName("Lynx1234");
        assertTrue(student.getUserName().equals("Lynx1234"));
    }

    @Test
    void setUserName() {
        Student student = new Student();
        student.setUserName("Lynx1234");
        assertTrue(student.getUserName().equals("Lynx1234"));
    }

    @Test
    void getCourse() {
        Student student = new Student();
        CourseProgramme course = new CourseProgramme();
        student.setCourse(course);
        assertTrue(student.getCourse().equals(course));
    }

    @Test
    void setCourse() {
        Student student = new Student();
        CourseProgramme course = new CourseProgramme();
        student.setCourse(course);
        assertTrue(student.getCourse().equals(course));
    }

    @Test
    void getModules() {
        Student student = new Student();
        ArrayList<Module> modules = new ArrayList<Module>();
        student.setModules(modules);
        assertTrue(student.getModules().equals(modules));
    }

    @Test
    void setModules() {
        Student student = new Student();
        ArrayList<Module> modules = new ArrayList<Module>();
        student.setModules(modules);
        assertTrue(student.getModules().equals(modules));
    }
}