package com.accio.StudentManagement;

public class Student {
    private String name;
    private int enrollmentID;
    private int age;
    private String state;

    public Student(String name, int enrollmentID, int age, String state) {
        this.name = name;
        this.enrollmentID = enrollmentID;
        this.age = age;
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnrollmentID() {
        return enrollmentID;
    }

    public void setEnrollmentID(int enrollmentID) {
        this.enrollmentID = enrollmentID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
