package org.example;

import org.example.controller.Controller;
import org.example.controller.Stuff;
import org.example.model.Departments.ITDepratment;
import org.example.model.Departments.LawDepartment;
import org.example.model.Departments.ProductionDepartment;
import org.example.model.Model;
import org.example.view.View;

public class Main {
    public static void main(String[] args) {
        Model model = new Model();
        View view = new View();
        ITDepratment itDepratment = new ITDepratment();
        LawDepartment lawDepartment = new LawDepartment();
        ProductionDepartment productionDepartment = new ProductionDepartment();
        Stuff stuff = new Stuff();

        Controller controller = new Controller(model, view, itDepratment, lawDepartment, productionDepartment, stuff);
        controller.processUser();

    }
}
