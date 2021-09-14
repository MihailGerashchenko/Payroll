package org.example.model.Departments;

import org.example.model.entity.Employee;
import org.example.model.entity.Manager;

import java.util.Arrays;

public class LawDepartment {
    private Employee[] employees;
    private Manager manager;

    public LawDepartment(Employee[] employees, Manager manager) {
        this.employees = employees;
        this.manager = manager;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    public void setEmployees(Employee[] employees) {
        this.employees = employees;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    @Override
    public String toString() {
        return "LawDepartment{" +
                "employees=" + Arrays.toString(employees) +
                ", manager=" + manager +
                '}';
    }
}
