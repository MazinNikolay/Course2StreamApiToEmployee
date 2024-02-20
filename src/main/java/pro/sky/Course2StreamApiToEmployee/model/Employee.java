package pro.sky.Course2StreamApiToEmployee.model;

import pro.sky.Course2StreamApiToEmployee.exception.AddedEmloyeeEmptyDataException;
import pro.sky.Course2StreamApiToEmployee.utilityClasses.CheckEmptyUtilityClass;

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
        if (CheckEmptyUtilityClass.checkEmptyData(firstName)) {
            throw new AddedEmloyeeEmptyDataException("Не заполнено одно из полей с данными сотрудника");
        } else {
            this.firstName = firstName;
        }

        if (CheckEmptyUtilityClass.checkEmptyData(surName)) {
            throw new AddedEmloyeeEmptyDataException("Не заполнено одно из полей с данными сотрудника");
        } else {
            this.surName = surName;
        }

        if (CheckEmptyUtilityClass.checkEmptyData(lastName)) {
            throw new AddedEmloyeeEmptyDataException("Не заполнено одно из полей с данными сотрудника");
        } else {
            this.lastName = lastName;
        }

        if (CheckEmptyUtilityClass.checkEmptyData(department)) {
            throw new AddedEmloyeeEmptyDataException("Не заполнено одно из полей с данными сотрудника");
        } else {
            this.department = department;
        }

        if (CheckEmptyUtilityClass.checkEmptyData(salary)) {
            throw new AddedEmloyeeEmptyDataException("Не заполнено одно из полей с данными сотрудника");
        } else {
            this.salary = salary;
        }
    }

    public Employee(String firstName, String surName, String lastName) {
        counter++;
        id = counter;
        if (CheckEmptyUtilityClass.checkEmptyData(firstName)) {
            throw new AddedEmloyeeEmptyDataException("Не заполнено одно из полей с данными сотрудника");
        } else {
            this.firstName = firstName;
        }

        if (CheckEmptyUtilityClass.checkEmptyData(surName)) {
            throw new AddedEmloyeeEmptyDataException("Не заполнено одно из полей с данными сотрудника");
        } else {
            this.surName = surName;
        }

        if (CheckEmptyUtilityClass.checkEmptyData(lastName)) {
            throw new AddedEmloyeeEmptyDataException("Не заполнено одно из полей с данными сотрудника");
        } else {
            this.lastName = lastName;
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
