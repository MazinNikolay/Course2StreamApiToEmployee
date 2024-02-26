package pro.sky.Course2StreamApiToEmployee.service;

import org.springframework.stereotype.Service;
import pro.sky.Course2StreamApiToEmployee.exception.EmployeeNotFoundException;
import pro.sky.Course2StreamApiToEmployee.model.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final PreviousEmployeeService previousEmployeeService;

    public EmployeeServiceImpl(PreviousEmployeeService previousEmployeeService) {
        this.previousEmployeeService = previousEmployeeService;
    }

    @Override
    public Employee addEmployee(String firstName, String surName, String lastName, int department, double salary) {
        return previousEmployeeService.addEmployee(firstName, surName, lastName, department, salary);
    }

    @Override
    public Employee removeEmployee(String firstName, String surName, String lastName) {
        return previousEmployeeService.removeEmployee(firstName, surName, lastName);
    }

    @Override
    public Employee findEmployee(String firstName, String surName, String lastName) {
        return previousEmployeeService.findEmployee(firstName, surName, lastName);
    }

    @Override
    public Map<String, Employee> printAllEmployees() {
        return previousEmployeeService.printAllEmployees();
    }

    @Override
    public void indexSalaryesForDepartment(int indexValue, int dept) {
        printAllEmployees().values().stream()
                .filter(e -> e.getDepartment() == dept)
                .forEach(e -> e.setSalary(Math.round(e.getSalary() + e.getSalary() * indexValue / 1000)));
    }

    @Override
    public double avgSalaryForDepartment(int dept) {
        return printAllEmployees().values().stream()
                .filter(e -> e.getDepartment() == dept)
                .mapToDouble(e -> e.getSalary())
                .average().orElse(00);
    }

    @Override
    public Employee maxSalaryEmployeeInDept(int dept) {
        return printAllEmployees().values().stream()
                .filter(e -> e.getDepartment() == dept)
                .max(Comparator.comparingDouble(e -> e.getSalary())).orElseThrow(() -> new EmployeeNotFoundException("Сотрудник с заданными данными не найден"));
    }

    @Override
    public Employee minSalaryEmployeeInDept(int dept) {
        return printAllEmployees().values().stream()
                .filter(e -> e.getDepartment() == dept)
                .min(Comparator.comparingDouble(e -> e.getSalary())).orElseThrow(() -> new EmployeeNotFoundException("Сотрудник с заданными данными не найден"));
    }

    @Override
    public List<Employee> employeesInDepartment(int dept) {
        return printAllEmployees().values().stream()
                .filter(e -> e.getDepartment() == dept)
                .collect(Collectors.toList());
    }

    @Override
    public List<Employee> allEmployeesInDepartments() {
        return printAllEmployees().values().stream()
                .sorted(Comparator.comparingInt(e -> e.getDepartment()))
                .collect(Collectors.toList());
    }
}
