package com.epam;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        NumberOfEmployeesVisitor numberOfEmployeesVisitor = new NumberOfEmployeesVisitor();
        TotalSalariesVisitor totalSalariesVisitor = new TotalSalariesVisitor();
        AverageSalaryVisitor averageSalaryVisitor = new AverageSalaryVisitor();

        Company company = createCompany();

        company.accept(numberOfEmployeesVisitor);
        company.accept(totalSalariesVisitor);
        company.accept(averageSalaryVisitor);

        System.out.println("numberOfEmployees: " + numberOfEmployeesVisitor.getNumberOfEmployees());
        System.out.println("totalSalaries: " + totalSalariesVisitor.getTotalSalaries());
        System.out.println("averageSalary: " + averageSalaryVisitor.getAverageSalary());

    }

    private static Company createCompany() {
        List<Employee> employees = createEmployees();
        return new Company(employees);
    }

    private static List<Employee> createEmployees() {
        List<Employee> employees = new ArrayList<Employee>();

        Employee e1 = new Employee();
        e1.setName("John Doe");
        e1.setDepartment("Department 1");
        e1.setSalary(1000);

        Employee e2 = new Employee();
        e2.setName("Jane Doe");
        e2.setDepartment("Department 1");
        e2.setSalary(1200);

        Employee e3 = new Employee();
        e3.setName("Jill Doe");
        e3.setDepartment("Department 2");
        e3.setSalary(1300);

        Employee e4 = new Employee();
        e4.setName("Bill Doe");
        e4.setDepartment("Department 2");
        e4.setSalary(1300);

        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);

        return employees;


    }

}
