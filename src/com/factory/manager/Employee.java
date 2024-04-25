package com.factory.manager;

public class Employee {
    private String name;
    private String surname;
    private int age;
    private int year;

    public Employee(String name, String surname, int age, int year) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.year = year;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
