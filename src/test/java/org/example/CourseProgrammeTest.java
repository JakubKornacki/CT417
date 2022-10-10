package org.example;

import org.checkerframework.checker.units.qual.C;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CourseProgrammeTest {

    @Test
    void getCourseName() {
        CourseProgramme courseProgramme = new CourseProgramme();
        courseProgramme.setCourseName("1BCT");
        assertTrue(courseProgramme.getCourseName().equals("1BCT"));
    }

    @Test
    void setCourseName() {
        CourseProgramme courseProgramme = new CourseProgramme();
        courseProgramme.setCourseName("1BCT");
        assertTrue(courseProgramme.getCourseName().equals("1BCT"));
    }

    @Test
    void getListOfModules() {
        CourseProgramme courseProgramme = new CourseProgramme();
        courseProgramme.setListOfModules(null);
        assertTrue(courseProgramme.getListOfModules().equals(null));
    }

    @Test
    void setListOfModules() {
        CourseProgramme courseProgramme = new CourseProgramme();
        courseProgramme.setListOfModules(null);
        assertTrue(courseProgramme.getListOfModules().equals(null));
    }

    @Test
    void getListOfStudents() {
        CourseProgramme courseProgramme = new CourseProgramme();
        courseProgramme.setListOfStudents(null);
        assertTrue(courseProgramme.getListOfStudents().equals(null));
    }


    @Test
    void setListOfStudents() {
        CourseProgramme courseProgramme = new CourseProgramme();
        courseProgramme.setListOfStudents(null);
        assertTrue(courseProgramme.getListOfStudents().equals(null));
    }

    @Test
    void getAcademicStartDate() {
        CourseProgramme courseProgramme = new CourseProgramme();
        DateTime date = new DateTime(2022,10,10,10,10);
        courseProgramme.setAcademicStartDate(date);
        assertTrue(courseProgramme.getAcademicStartDate().equals(date));
    }

    @Test
    void setAcademicStartDate() {
        CourseProgramme courseProgramme = new CourseProgramme();
        DateTime date = new DateTime(2022,10,10,10,10);
        courseProgramme.setAcademicStartDate(date);
        assertTrue(courseProgramme.getAcademicStartDate().equals(date));
    }

    @Test
    void getAcademicEndDate() {
        CourseProgramme courseProgramme = new CourseProgramme();
        DateTime date = new DateTime(2022,10,10,10,10);
        courseProgramme.setAcademicStartDate(date);
        assertTrue(courseProgramme.getAcademicStartDate().equals(date));
    }

    @Test
    void setAcademicEndDate() {
        CourseProgramme courseProgramme = new CourseProgramme();
        DateTime date = new DateTime(2022,10,10,10,10);
        courseProgramme.setAcademicEndDate(date);
        assertTrue(courseProgramme.getAcademicEndDate().equals(date));
    }
}