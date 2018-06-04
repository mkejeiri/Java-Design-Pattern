package com.kejeiri.java.course.view;

import com.kejeiri.java.course.model.Employee;

public class EmployeeDashboard {
    public void printEmployeeInfo(Employee employee){
        System.out.println("FirstName: "+employee.getFirstName());
        System.out.println("LastName: "+employee.getLastName());
        System.out.println("SS number: "+employee.getSsNumber());
        System.out.println("Salary: "+employee.getSalary());
    }
}
