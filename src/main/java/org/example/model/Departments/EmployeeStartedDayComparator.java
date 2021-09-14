package org.example.model.Departments;

import org.example.model.entity.Employee;

import java.util.Comparator;

public class EmployeeStartedDayComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Employee employee1 = (Employee) o1;
        Employee employee2 = (Employee) o2;

        String startedDay1 = employee1.getEmpployeeStartedDay();
        String startedDay2 = employee2.getEmpployeeStartedDay();

        if (startedDay1.compareTo(startedDay2) > 0) {
            return 1;
        }
        if (startedDay1.compareTo(startedDay2) < 0) {
            return -1;
        }
        return 0;
    }
}
