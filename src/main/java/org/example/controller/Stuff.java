package org.example.controller;

import org.example.model.Departments.ITDepratment;
import org.example.model.Departments.LawDepartment;
import org.example.model.Departments.ProductionDepartment;
import org.example.model.entity.Employee;
import org.example.model.entity.Manager;
import org.example.model.entity.Seniour;

import static org.example.controller.SaleryConteiner.*;

public class Stuff {
    private ITDepratment itDepratment;
    private LawDepartment lawDepartment;
    private ProductionDepartment productionDepartment;

    public ITDepratment ITDepartmentComplectation() {
        itDepratment = new ITDepratment();
        Employee firstEmployeeITDepartment = new Employee("Oleg", "Timoshenko", "Nikolaevich", "20.03.1991",
                "19.10.2021", IT_EMPLOYEE);
        Employee secondEmployeeITDepartment = new Employee("Soliana", "Tarasovna", "Ihorihna", "20.03.1991",
                "14.05.2021", IT_EMPLOYEE);
        Manager managerITDepartment = new Manager("Taras", "Shevchenko", "Nikolaevich",
                "25.02.1964", "14.03.2018", IT_EMPLOYEE, itDepratment.getEmployees());
        itDepratment.addEmployee(firstEmployeeITDepartment);
        itDepratment.addEmployee(secondEmployeeITDepartment);
        itDepratment.setManager(managerITDepartment);
        return itDepratment;
    }

    public LawDepartment LawDepartmentComplectation() {
        lawDepartment = new LawDepartment();
        Employee firstEmployeeLawDepartment = new Employee("Pavel", "Davidov", "Serheevich", "26.12.1990",
                "08.11.2020", LAW_EMPLOYEE);
        Employee secondEmployeeLawDepartment = new Employee("Juliani", "Tadeevich", "Alekseevich", "05.06.1991",
                "13.05.2009", LAW_EMPLOYEE);
        Manager managerLawDepartment = new Manager("David", "Pareshvili", "Davidovich",
                "11.08.1969", "11.03.2019", LAW_EMPLOYEE, lawDepartment.getEmployees());
        lawDepartment.addEmployee(firstEmployeeLawDepartment);
        lawDepartment.addEmployee(secondEmployeeLawDepartment);
        lawDepartment.setManager(managerLawDepartment);
        return lawDepartment;
    }

    public ProductionDepartment ProductionDepartmentComplectation() {
        productionDepartment = new ProductionDepartment();
        Employee firstEmployeeProductionDepartment = new Employee("Ihor", "Sikevich", "Oleksiovich", "15.09.1980",
                "14.04.2018", PRODUCTION_EMPLOYEE);
        Employee secondProductionDepartment = new Employee("Taras", "Berezovets", "Serhiovich", "14.10.1985",
                "14.06.2019", PRODUCTION_EMPLOYEE);
        Manager managerProductionDepartment = new Manager("Petro", "Moskito", "Vasilievich",
                "22.08.1989", "14.06.2020", PRODUCTION_EMPLOYEE, productionDepartment.getEmployees());
        productionDepartment.addEmployee(firstEmployeeProductionDepartment);
        productionDepartment.addEmployee(secondProductionDepartment);
        productionDepartment.setManager(managerProductionDepartment);
        return productionDepartment;
    }

    public Seniour senioursComplectation() {
        Seniour CEO = new Seniour("Oleg", "Sadovui", "Tarasovich", "01.10.1975",
                "14.09.2021", SENIOUR, "CEO is responsible for external affairs");
        return CEO;
    }
}
