package org.example.view;

import org.example.model.entity.Employee;
import org.example.model.entity.Manager;
import org.example.model.entity.Seniour;

import java.util.Arrays;

public class View {

    public static final String IT = "There are such employees and manager who supervises stuff in IT department : ";
    public static final String LAW = "There are such employees and manager in Law department : ";
    public static final String PRODACT = "There are such employees and manager in Production department : ";
    public static final String SENIOUR = "There is seniour : ";

    public void printMessage(String message, Employee[] employees, Manager manager) {
        System.out.println(message + " " + Arrays.toString(employees) + " " + manager);
    }

    public void printMassage(String meessage, Seniour seniour) {
        System.out.println(meessage + seniour);
    }
}
