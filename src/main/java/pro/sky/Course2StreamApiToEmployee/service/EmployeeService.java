package pro.sky.Course2StreamApiToEmployee.service;

import pro.sky.Course2StreamApiToEmployee.model.Employee;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface EmployeeService {

    Employee addEmployee(String firstName, String surName, String lastName, int department, double salary);

    Employee removeEmployee(String firstName, String surName, String lastName);

    Employee findEmployee(String firstName, String surName, String lastName);

    Map<String, Employee> printAllEmployees();

    Employee maxSalaryEmployeeInDept(int dept);

    Employee minSalaryEmployeeInDept(int dept);

    List<Employee> employeesInDepartment(int dept);

    List<Employee> allEmployeesInDepartments();
}
