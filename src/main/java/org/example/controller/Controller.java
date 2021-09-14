package org.example.controller;

import org.example.model.Departments.EmployeeSurnameComparator;
import org.example.model.Departments.ITDepratment;
import org.example.model.Departments.LawDepartment;
import org.example.model.Departments.ProductionDepartment;
import org.example.model.Model;
import org.example.model.entity.Employee;
import org.example.model.entity.Manager;
import org.example.model.entity.Seniour;
import org.example.view.View;

import java.util.Arrays;
import java.util.Comparator;

import static org.example.view.View.STUFF;

public class Controller {
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
        financialIssue();
        toDisplayDepartmentsBeforeBonuses();
        calculateSalaryWithBonuses();

    }

    public void financialIssue() {
        this.itDepratment = new ITDepratment(stuff.ITDepartmentComplectation().getEmployees(),
                stuff.ITDepartmentComplectation().getManager());
        this.lawDepartment = new LawDepartment(stuff.LawDepartmentComplectation().getEmployees(),
                stuff.LawDepartmentComplectation().getManager());
        this.productionDepartment = new ProductionDepartment(stuff.ProductionDepartmentComplectation().getEmployees(),
                stuff.ProductionDepartmentComplectation().getManager());
    }


    public void toDisplayDepartmentsBeforeBonuses() {
        view.printMessage(STUFF);
        view.printMessage(View.IT, itDepratment);
        view.printMessage(View.LAW, lawDepartment);
        view.printMessage(View.PRODACT, productionDepartment);
        view.printMassage(View.SENIOUR, stuff.senioursComplectation());
    }

    protected void calculateSalaryWithBonuses() {
        Employee[] IT = bonusesEmployee(itDepratment.getEmployees());
        Employee[] LAW = bonusesEmployee(lawDepartment.getEmployees());
        Employee[] PRODUCT = bonusesEmployee(productionDepartment.getEmployees());
        Manager ITmanager = bonusesManager(itDepratment.getManager());
        Manager LAWmanager = bonusesManager(lawDepartment.getManager());
        Manager PRODUCTmanager = bonusesManager(productionDepartment.getManager());
        Seniour seniour = bonusesSeniour(stuff.senioursComplectation());

        itDepratment = new ITDepratment(IT, ITmanager);
        lawDepartment = new LawDepartment(LAW, LAWmanager);
        productionDepartment = new ProductionDepartment(PRODUCT, PRODUCTmanager);
        sortEmployees(itDepratment, lawDepartment, productionDepartment);

        view.printMessageManager(View.IT_SALARY, createListWithSalary(IT));
        view.printMessage(View.LAW_SALARY, createListWithSalary(LAW));
        view.printMessage(View.PRODUCT_SALARY, createListWithSalary(PRODUCT));
        view.printMessage(View.MANAGERS, createListWithSalary(itDepratment.getManager(),
                lawDepartment.getManager(), productionDepartment.getManager()));
        view.printMassage(View.SENIOUR_BONUSES, createListWithSalary(seniour));
    }

    protected Employee[] bonusesEmployee(Employee[] employee) {
        int sum;
        int finalSum;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            sum = employee[i].getPayroll();
            finalSum = (int) (sum * 1.3);
            employee[i].setPayroll(finalSum);
        }
        return employee;
    }

    protected Manager bonusesManager(Employee employee) {
        int sum = employee.getPayroll();
        int finalSum = (int) (sum * 2);
        employee.setPayroll(finalSum);
        return (Manager) employee;
    }

    protected Seniour bonusesSeniour(Employee employee) {
        int sum = employee.getPayroll();
        int finalSum = (int) (sum * 3);
        employee.setPayroll(finalSum);
        return (Seniour) employee;
    }

    private static String[] createListWithSalary(Employee[] employees) {
        String[] arrayWithBonuses = new String[employees.length];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            arrayWithBonuses[i] = employees[i].getSurname() + " " + employees[i].getPayroll();
        }
        return arrayWithBonuses;
    }

    private static String[] createListWithSalary(Manager... managers) {
        Arrays.sort(managers, Comparator.nullsFirst(new EmployeeSurnameComparator()));
        String[] arrayWithBonuses = new String[managers.length];
        for (int i = 0; i < managers.length; i++) {
            if (managers[i] == null) {
                continue;
            }
            arrayWithBonuses[i] = managers[i].getSurname() + " " + managers[i].getPayroll();
        }
        return arrayWithBonuses;
    }

    private static String createListWithSalary(Seniour seniour) {
        String newSeniour = seniour.getSurname() + " " + seniour.getPayroll();
        return newSeniour;
    }

    private static void sortEmployees(ITDepratment itDepratment, LawDepartment lawDepartment,
                                      ProductionDepartment productionDepartment) {
        itDepratment.sortEmployeesForStartedDay();
        itDepratment.sortEmployeesForSurname();

        lawDepartment.sortEmployeesForStartedDay();
        lawDepartment.sortEmployeesForSurname();

        productionDepartment.sortEmployeesForStartedDay();
        productionDepartment.sortEmployeesForSurname();
    }
}

