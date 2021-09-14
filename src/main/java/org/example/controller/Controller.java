package org.example.controller;

import org.example.model.Departments.ITDepratment;
import org.example.model.Departments.LawDepartment;
import org.example.model.Departments.ProductionDepartment;
import org.example.model.Model;
import org.example.model.entity.Employee;
import org.example.model.entity.Manager;
import org.example.model.entity.Seniour;
import org.example.view.View;


public class Controller implements SalaryAssingment {
    private Model model;
    private View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void processUser() {


    }

    private void createDepartments() {
        Manager managerIT = new Manager(fourEmployeesForITDepartment());
        Manager managerLaw = new Manager(fiveEmployeesForLawDepartment());
        Manager managerProduction = new Manager(threeEmployeesForProductionDepartment());

        ITDepratment ITDepratment = new ITDepratment(calculateSalaryEmployee(fourEmployeesForITDepartment()), calculateSalaryManager(managerIT));
        LawDepartment lawDepartment = new LawDepartment(calculateSalaryEmployee(fiveEmployeesForLawDepartment()), calculateSalaryManager(managerLaw));
        ProductionDepartment productionDepartment =
                new ProductionDepartment(calculateSalaryEmployee(threeEmployeesForProductionDepartment()), calculateSalaryManager(managerProduction));
        Seniour CEO = new Seniour("CEO is responsible for in-depth issues");
        Seniour deputyCEO = new Seniour("deputyCEO is respunsible for departments");

        int CEOSum = calculateSalarySeniour(CEO);
        int deputyCEOSum = calculateSalarySeniour(deputyCEO);

        returnOveralSum(salarySum(calculateSalaryEmployee(fourEmployeesForITDepartment()), calculateSalaryManager(managerIT)),
                salarySum(calculateSalaryEmployee(fiveEmployeesForLawDepartment()), calculateSalaryManager(managerLaw)),
                salarySum(calculateSalaryEmployee(threeEmployeesForProductionDepartment()), calculateSalaryManager(managerProduction)));

    }

    protected Employee[] fourEmployeesForITDepartment() {
        Employee[] forIT = new Employee[]{new Employee(), new Employee(),
                new Employee(), new Employee()};
        return forIT;
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

    private int salarySum(Employee[] employees, Manager manager) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getPayroll();
        }
        return sum + manager.getPayroll();
    }

    private int returnOveralSum(int CEOsum, int deputyCEO, int method) {
        int result = CEOsum + deputyCEO + method;
        return result;
    }
}

