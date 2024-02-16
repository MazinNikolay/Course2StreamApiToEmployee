package pro.sky.Course2StreamApiToEmployee.model;

import pro.sky.Course2StreamApiToEmployee.exception.AddedEmloyeeEmptyDataException;

import java.util.Objects;

public class Employee {

    private static int counter = 0;
    private String firstName = "";
    private String lastName = "";
    private String surName = "";
    private int department;
    private double salary;
    private int id;

    public Employee(String firstName, String surName, String lastName, int department, double salary) {
        counter++;
        id = counter;
        checkEmptyData(firstName);
        this.firstName = firstName;
        checkEmptyData(surName);
        this.surName = surName;
        checkEmptyData(lastName);
        this.lastName = lastName;
        checkEmptyData(department);
        this.department = department;
        checkEmptyData(salary);
        this.salary = salary;
    }

    public Employee(String firstName, String surName, String lastName) {
        counter++;
        id = counter;
        checkEmptyData(firstName);
        this.firstName = firstName;
        checkEmptyData(surName);
        this.surName = surName;
        checkEmptyData(lastName);
        this.lastName = lastName;
    }

    public void checkEmptyData(String data) {
        if (data.isEmpty() || data.isBlank()) {
            throw new AddedEmloyeeEmptyDataException("Не заполнено одно из полей с данными сотрудника");
        }
    }

    public void checkEmptyData(int data) {
        if (data <= 0) {
            throw new AddedEmloyeeEmptyDataException("Не заполнено одно из полей с данными сотрудника");
        }
    }

    public void checkEmptyData(double data) {
        if (data <= 0) {
            throw new AddedEmloyeeEmptyDataException("Не заполнено одно из полей с данными сотрудника");
        }
    }

    public int getId() {
        return id;
    }

    public int getCounter() {
        return counter;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSurName() {
        return surName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public void setDepartment(int dept) {
        this.department = dept;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id=" + id + " " + firstName + " " + surName + " " + lastName + " department-" + department + " salary=" + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(surName, employee.surName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
