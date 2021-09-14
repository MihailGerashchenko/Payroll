package org.example.model.Departments;

import org.example.model.entity.Employee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.example.controller.SaleryConteiner.LAW_EMPLOYEE;
import static org.junit.jupiter.api.Assertions.*;

class ProductionDepartmentTest {
    private ProductionDepartment productionDepartment;

    @Test
    @DisplayName("Check method if it adds and removes employee in ProductionDepartment")
    void testAddAndRemoveEmployeeMethod() {
        productionDepartment = new ProductionDepartment();
        Employee employee = new Employee("Juliani", "Tadeevich",
                "Alekseevich", "05.06.1991", "13.05.2009", LAW_EMPLOYEE);
        Assertions.assertAll(
                () -> assertTrue(productionDepartment.addEmployee(employee)),
                () -> assertTrue(productionDepartment.removeEmployee("Tadeevich")));
    }
}