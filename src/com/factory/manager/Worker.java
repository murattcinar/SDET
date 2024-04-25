package com.factory.manager;

public class Worker extends Employee{
    protected double salary;

    public Worker(String name, String surname, int age, int year, double salary) {
        super(name, surname, age, year);
        this.salary = salary;
    }

    public void calculateSalary() {
        this.salary *= 1.5;
        System.out.println("İşçi Maaşı: Maaş * 1.5 " + salary);
    }
}
