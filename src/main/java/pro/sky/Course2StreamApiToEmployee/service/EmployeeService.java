package pro.sky.Course2StreamApiToEmployee.service;

import pro.sky.Course2StreamApiToEmployee.model.Employee;

import java.util.Map;

public interface EmployeeService {

    Employee addEmployee(String firstName, String surName, String lastName, int department, double salary);

    Employee removeEmployee(String firstName, String surName, String lastName);

    Employee findEmployee(String firstName, String surName, String lastName);

    Map<String, Employee> printAllEmployees();
}
