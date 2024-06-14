package com.example.demo.domain;

public class user {
    private String fullName;
    private int age;
    private boolean employed;
    private String gender;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isEmployed() {
        return employed;
    }

    public void setEmployed(boolean employed) {
        this.employed = employed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public user() {
        super();
    }

    public user(int age, String fullName, boolean employed, String gender) {
        super();
        this.age = age;
        this.fullName = fullName;
        this.employed = employed;
        this.gender = gender;
    }
}
