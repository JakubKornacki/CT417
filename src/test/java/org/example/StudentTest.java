package org.example;

import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

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
        assertTrue(student.getName().equals("Robert Lynx 12345678"));
    }

    @Test
    void setName() {
        Student student = new Student();
        student.setName("Robert Lynx");
        assertTrue(student.getName().equals("Robert Lynx 12345678"));
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
        student.setCourse(null);
        assertTrue(student.getCourse().equals(null));
    }

    @Test
    void setCourse() {
        Student student = new Student();
        student.setCourse(null);
        assertTrue(student.getCourse().equals(null));
    }

    @Test
    void getModules() {
        Student student = new Student();
        student.setModules(null);
        assertTrue(student.getModules().equals(null));
    }

    @Test
    void setModules() {
        Student student = new Student();
        student.setModules(null);
        assertTrue(student.getModules().equals(null));
    }
}