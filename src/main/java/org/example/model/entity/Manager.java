package org.example.model.entity;

import java.util.Arrays;

public class Manager extends Employee {
    private Employee[] employees;

    public Manager() {
    }

    public Manager(Employee[] employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "employees=" + Arrays.toString(employees) + super.toString();
    }
}

