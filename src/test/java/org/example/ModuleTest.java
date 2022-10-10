package org.example;

import org.junit.jupiter.api.Test;

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
        module.setModuleName("CT417");
        assertTrue(module.getModuleName().equals("CT417"));
    }

    @Test
    void setStudents() {
        Module module = new Module();
        module.setStudents(null);
        assertTrue(module.getStudents().equals(null));
    }

    @Test
    void getAssociatedCourses() {
        Module module = new Module();
        module.setAssociatedCourses(null);
        assertTrue(module.getAssociatedCourses().equals(null));
    }

    @Test
    void setAssociatedCourses() {
        Module module = new Module();
        module.setAssociatedCourses(null);
        assertTrue(module.getAssociatedCourses().equals(null));
    }

    @Test
    void getLecturer() {
        Module module = new Module();
        module.setLecturer(null);
        assertTrue(module.getLecturer().equals(null));
    }

    @Test
    void setLecturer() {
        Module module = new Module();
        module.setLecturer(null);
        assertTrue(module.getLecturer().equals(null));
    }
}