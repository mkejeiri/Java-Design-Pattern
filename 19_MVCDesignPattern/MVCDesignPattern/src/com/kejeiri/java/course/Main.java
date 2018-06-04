package com.kejeiri.java.course;

import com.kejeiri.java.course.controller.EmployeeController;
import com.kejeiri.java.course.model.Employee;
import com.kejeiri.java.course.view.EmployeeDashboard;

public class Main {

    public static void main(String[] args) {
        Employee employee =retrieveEmployeeFromServer();
        //Create our view to which we will write our employee info into

        EmployeeDashboard view= new EmployeeDashboard();

        //Create our controller
        EmployeeController controller = new EmployeeController(employee, view);
        controller.updateDashboardView();
    }

    //simulate a call to a server
    public static Employee retrieveEmployeeFromServer(){
        Employee employee = new Employee();
        employee.setLastName("kejeiri");
        employee.setFirstName("mohamed");
        employee.setSsNumber("12445");
        employee.setSalary(4000.60);
        return employee;
    }
}
