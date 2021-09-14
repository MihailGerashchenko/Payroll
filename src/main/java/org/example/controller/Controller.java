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

    private ITDepratment itDepratment;
    private LawDepartment lawDepartment;
    private ProductionDepartment productionDepartment;
    private Stuff stuff;

    public Controller(Model model, View view, ITDepratment itDepratment,
                      LawDepartment lawDepartment, ProductionDepartment productionDepartment, Stuff stuff) {
        this.model = model;
        this.view = view;
        this.itDepratment = itDepratment;
        this.lawDepartment = lawDepartment;
        this.productionDepartment = productionDepartment;
        this.stuff = stuff;
    }

    public void processUser() {

        view.printMessage(View.IT, stuff.ITDepartmentComplectation().getEmployees(),
                stuff.ITDepartmentComplectation().getManager());
        view.printMessage(View.LAW, stuff.LawDepartmentComplectation().getEmployees(),
                stuff.LawDepartmentComplectation().getManager());
        view.printMessage(View.PRODACT, stuff.ProductionDepartmentComplectation().getEmployees(),
                stuff.ProductionDepartmentComplectation().getManager());
        view.printMassage(View.SENIOUR, stuff.senioursComplectation());
    }

    private void createDepartments() {
//        CombinedDepartments CD = new CombinedDepartments();
//
//        Manager managerIT = new Manager(CD.fulfillDepartmentwithFourEmployees());
//        Manager managerLaw = new Manager(CD.fulfillDepartmentwithFourEmployees());
//        Manager managerProduction = new Manager(CD.fulfillDepartmentwithFourEmployees());
//
//        ITDepratment ITDepratment = new ITDepratment(CD.calculateSalaryEmployee(
//                CD.fulfillDepartmentwithFourEmployees()), CD.calculateSalaryManager(managerIT));
//        LawDepartment lawDepartment = new LawDepartment(CD.calculateSalaryEmployee(
//                CD.fulfillDepartmentwithFourEmployees()), CD.calculateSalaryManager(managerLaw));
//        ProductionDepartment productionDepartment =
//                new ProductionDepartment(CD.calculateSalaryEmployee(
//                        CD.fulfillDepartmentwithFourEmployees()), CD.calculateSalaryManager(managerProduction));
//        Seniour CEO = new Seniour("CEO is responsible for in-depth issues");
//        Seniour deputyCEO = new Seniour("deputyCEO is respunsible for departments");
//
//        int CEOSum = calculateSalarySeniour(CEO);
//        int deputyCEOSum = calculateSalarySeniour(deputyCEO);

//        returnOveralSum(salarySum(calculateSalaryEmployee(fourEmployeesForITDepartment()), calculateSalaryManager(managerIT)),
//                salarySum(calculateSalaryEmployee(fiveEmployeesForLawDepartment()), calculateSalaryManager(managerLaw)),
//                salarySum(calculateSalaryEmployee(threeEmployeesForProductionDepartment()), calculateSalaryManager(managerProduction)));

    }

    private void financial() {

    }

    private int salarySum(Employee[] employees, Manager manager) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getPayroll();
        }
        return sum + manager.getPayroll();
    }
//
//    private int returnOveralSum(int CEOsum, int deputyCEO, int method) {
//        int result = CEOsum + deputyCEO + method;
//        return result;
//    }
}

