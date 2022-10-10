package org.example;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class Lecturer {
    private String name;
    private int age;
    private DateTime dateOfBirth;
    private int id;
    private String userName;
    private ArrayList<Module> modulesThought = new ArrayList<Module>();

    public Lecturer(String name, int age, DateTime dateOfBirth, int id, String userName, ArrayList<Module> modulesThought) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.id = id;
        this.userName = userName;
        this.modulesThought = modulesThought;
    }

    public Lecturer(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(DateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName + " " + age;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ArrayList<Module> getModulesThought() {
        return modulesThought;
    }

    public void setModulesThought(ArrayList<Module> modulesThought) {
        this.modulesThought = modulesThought;
    }
}
