package org.example.view;

import org.example.model.Departments.ITDepratment;
import org.example.model.Departments.LawDepartment;
import org.example.model.Departments.ProductionDepartment;

import org.example.model.entity.Seniour;

import java.util.Arrays;

public class View {

    public static final String IT = "Employees and manager who supervises stuff in IT department : ";
    public static final String LAW = "Employees and manager who supervises stuff in Law department : ";
    public static final String PRODACT = "Employees and manager who supervises stuff in Production department : ";
    public static final String SENIOUR = "There is seniour : ";
    public static final String STUFF = "All stuff consisnts of : ";
    public static final String IT_SALARY = "IT employees gain such salary with bonuses : ";
    public static final String LAW_SALARY = "Law employees gain such salary with bonuses : ";
    public static final String PRODUCT_SALARY = "Product employees gain such salary with bonuses : ";
    public static final String MANAGERS = "Managers gain such salary with bonuses : ";
    public static final String SENIOUR_BONUSES = "Seniour gains such salary with bonuses : ";

    public void printMessage(String message, ITDepratment itDepratment) {
        System.out.println(message + " " + itDepratment);
    }

    public void printMessage(String message, LawDepartment lawDepartment) {
        System.out.println(message + " " + lawDepartment);
    }

    public void printMessage(String message, ProductionDepartment productionDepartment) {
        System.out.println(message + " " + productionDepartment);
    }

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMassage(String meessage, Seniour seniour) {
        System.out.println(meessage + " " + seniour);
    }

    public void printMassage(String meessage, String message) {
        System.out.println(meessage + " " + message);
    }

    public void printMessage(String text, String[] salary) {
        System.out.println(text);
        for (int i = 0; i < salary.length; i++) {
            System.out.println(salary[i]);
        }
        System.out.println();
    }

    public void printMessageManager(String text, String[] salary) {
        System.out.println(text);
        for (int i = 0; i < salary.length; i++) {
            System.out.println(salary[i]);
        }
        System.out.println();
    }
}
