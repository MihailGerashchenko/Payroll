package org.example.controller;

import org.example.model.Departments.ITDepratment;
import org.example.model.Departments.LawDepartment;
import org.example.model.Departments.ProductionDepartment;
import org.example.model.entity.Employee;
import org.example.model.entity.Manager;

public class CombinedDepartments {


    public void returnSalary() {
    //    Manager managerIT = new Manager(fourEmployeesForITDepartment());
        Manager managerLaw = new Manager(fiveEmployeesForLawDepartment());
        Manager managerProduction = new Manager(threeEmployeesForProductionDepartment());
    }

    protected Employee[] fulfillDepartment() {
        Employee[] array = new Employee[]{new Employee(), new Employee(),
                new Employee(), new Employee()};
        return array;
    }

    protected Employee[] fiveEmployeesForLawDepartment() {
        Employee[] forLaw = new Employee[]{new Employee(), new Employee(),
                new Employee(), new Employee(), new Employee()};
        return forLaw;
    }

    protected Employee[] threeEmployeesForProductionDepartment() {
        Employee[] forProduction = new Employee[]{new Employee(), new Employee(),
                new Employee(), new Employee(), new Employee()};
        return forProduction;
    }
}
