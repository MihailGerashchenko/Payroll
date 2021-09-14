package org.example.model.Departments;

import org.example.model.entity.Employee;

import java.util.Comparator;

public class EmployeeSurnameComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Employee employee1 = (Employee) o1;
        Employee employee2 = (Employee) o2;

        String surname1 = employee1.getSurname();
        String surname2 = employee2.getSurname();

        if (surname1.compareTo(surname2) > 0) {
            return 1;
        }
        if (surname1.compareTo(surname2) < 0) {
            return -1;
        }
        return 0;
    }
}
