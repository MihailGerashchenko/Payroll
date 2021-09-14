package org.example.controller;

import org.example.model.entity.Employee;
import org.example.model.entity.Manager;

public interface SalaryAssingment {

    default Employee[] calculateSalaryEmployee(Employee[] employee) {
        int sum;
        int finalSum;
        for (int i = 0; i < employee.length; i++) {
            sum = employee[i].getPayroll();
            finalSum = (int) (sum * 1.3);
            employee[i].setPayroll(finalSum);
        }
        return employee;
    }

    default Manager calculateSalaryManager(Employee employee) {
        int sum = employee.getPayroll();
        int finalSum = (int) (sum * 2);
        employee.setPayroll(finalSum);
        return (Manager) employee;
    }

    default int calculateSalarySeniour(Employee employee) {
        int sum = employee.getPayroll();
        int finalSum = (int) (sum * 3);
        return finalSum;
    }
}
