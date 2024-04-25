package com.factory;

import com.factory.manager.Employee;
import com.factory.manager.Manager;
import com.factory.manager.Security;
import com.factory.manager.Worker;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Manager> manager = new ArrayList<>();
        manager.add(new Manager("Murat","Çınar",3,4,1500,"Manager"));
        manager.add(new Manager("Ahmet","Çınar",3,4,1500,"Manager"));

        for (Manager i : manager) {
            System.out.println(
                    i.getName() + " " +
                    i.getSurname() + " " +
                    i.getAge()
            );
        }

    }
}
