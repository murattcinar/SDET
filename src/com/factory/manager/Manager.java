package com.factory.manager;

public class Manager extends Employee{

    private String department;
    protected double salary;


    public Manager(String name, String surname, int age, int year, double salary, String department) {
        super(name, surname, age, year);
        this.department = department;
        this.salary = salary;
    }

    public void calculateSalary() {
        this.salary *= 2;
        System.out.println("Manager Maaşı: Maaş * 2 " + salary);
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

}
