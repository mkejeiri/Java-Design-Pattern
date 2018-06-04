package com.kejeiri.java.course.controller;

import com.kejeiri.java.course.model.Employee;
import com.kejeiri.java.course.view.EmployeeDashboard;

public class EmployeeController {
    private Employee employeeModel;
    private EmployeeDashboard view;

    public EmployeeController(Employee employeeModel, EmployeeDashboard view) {
        this.employeeModel = employeeModel;
        this.view = view;
    }

    public void setEmployee(String firstName, String lastName) {
        employeeModel.setFirstName(firstName);
        employeeModel.setLastName(lastName);
    }
    public String getEmployeeName(){return employeeModel.getFirstName()+" "+employeeModel.getLastName();}
    public void setSsNumber(String ssn)    {employeeModel.setSsNumber(ssn);}
    public String getSsn(){return employeeModel.getSsNumber();}
    //update our view
    public void updateDashboardView(){view.printEmployeeInfo(employeeModel);}
}

