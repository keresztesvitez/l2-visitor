package com.epam;

import java.util.List;

public class AverageSalaryVisitor implements Visitor {
    private double averageSalary = 0;

    public void visit(Company company) {
        List<Employee> employees = company.getEmployees();
        averageSalary = calculateAverageSalary(employees);
    }

    private int calculateAverageSalary(List<Employee> employees) {
        int total = 0;
        for (Employee e : employees) {
            total += e.getSalary();
        }
        return total / employees.size();
    }

    public double getAverageSalary() {
        return averageSalary;
    }
}
