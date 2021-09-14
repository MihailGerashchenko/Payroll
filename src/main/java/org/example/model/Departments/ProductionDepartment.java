package org.example.model.Departments;

import org.example.model.entity.Employee;
import org.example.model.entity.Manager;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

public class ProductionDepartment {
    private Employee[] employees = new Employee[4];
    private Manager manager;

    public ProductionDepartment() {
    }

    public ProductionDepartment(Employee[] employees, Manager manager) {
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

    public boolean addEmployee(Employee employee) {
        Objects.requireNonNull(employee);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    public boolean removeEmployee(String surname) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i].getSurname().equals(surname)) {
                employees[i] = null;
                return true;
            }
        }
        return false;
    }

    public void sortEmployeesForSurname() {
        Arrays.sort(employees, Comparator.nullsFirst(new EmployeeSurnameComparator()));
    }

    public void sortEmployeesForStartedDay() {
        Arrays.sort(employees, Comparator.nullsFirst(new EmployeeStartedDayComparator()));
    }


    @Override
    public String toString() {
        return "ProductionDepartment{" +
                "employees=" + Arrays.toString(employees) +
                ", manager=" + manager +
                '}';
    }
}
