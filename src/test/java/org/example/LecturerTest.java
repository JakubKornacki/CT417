package org.example;

import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LecturerTest {

    @Test
    void getName() {
        Lecturer lecturer = new Lecturer();
        lecturer.setName("Adam Dempsey");
        assertTrue(lecturer.getName().equals("Adam Dempsey"));
    }

    @Test
    void setName() {
        Lecturer lecturer = new Lecturer();
        lecturer.setName("Adam Dempsey");
        assertTrue(lecturer.getName().equals("Adam Dempsey"));
    }

    @Test
    void getAge() {
        Lecturer lecturer = new Lecturer();
        lecturer.setAge(12);
        assertTrue(lecturer.getAge() == 12);

    }

    @Test
    void setAge() {
        Lecturer lecturer = new Lecturer();
        lecturer.setAge(12);
        assertTrue(lecturer.getAge() == 12);
    }

    @Test
    void getDateOfBirth() {
        Lecturer lecturer = new Lecturer();
        DateTime date = new DateTime(1970,10,10,10,10);
        lecturer.setDateOfBirth(date);
        assertTrue(lecturer.getDateOfBirth().equals(date));
    }

    @Test
    void setDateOfBirth() {
        Lecturer lecturer = new Lecturer();
        DateTime date = new DateTime(1970,10,10,10,10);
        lecturer.setDateOfBirth(date);
        assertTrue(lecturer.getDateOfBirth().equals(date));
    }

    @Test
    void getId() {
        Lecturer lecturer = new Lecturer();
        lecturer.setId(1323232);
        assertTrue(lecturer.getId() == 1323232);
    }

    @Test
    void setId() {
        Lecturer lecturer = new Lecturer();
        lecturer.setId(1323232);
        assertTrue(lecturer.getId() == 1323232);
    }

    @Test
    void getUserName() {
        Lecturer lecturer = new Lecturer();
        lecturer.setUserName("Adam Dempsey");
        lecturer.setAge(17);
        assertTrue(lecturer.getUserName().equals("Adam Dempsey 17"));
    }

    @Test
    void setUserName() {
        Lecturer lecturer = new Lecturer();
        lecturer.setUserName("Adam Dempsey");
        lecturer.setAge(17);
        assertTrue(lecturer.getUserName().equals("Adam Dempsey 17"));
    }

    @Test
    void getModulesThought() {
        Lecturer lecturer = new Lecturer();
        ArrayList<Module> modules = new ArrayList<Module>();
        lecturer.setModulesThought(modules);
        assertTrue(lecturer.getModulesThought().equals(modules));
    }

    @Test
    void setModulesThought() {
        Lecturer lecturer = new Lecturer();
        ArrayList<Module> modules = new ArrayList<Module>();
        lecturer.setModulesThought(modules);
        assertTrue(lecturer.getModulesThought().equals(modules));
    }
}