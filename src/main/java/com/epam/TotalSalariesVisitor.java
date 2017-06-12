package com.epam;

import java.util.List;

public class TotalSalariesVisitor implements Visitor {

    private int totalSalaries = 0;

    public void visit(Company company) {
        List<Employee> employees = company.getEmployees();
        totalSalaries = calculateTotalSalaries(employees);
    }

    private int calculateTotalSalaries(List<Employee> employees) {
        int total = 0;
        for (Employee e : employees) {
            total += e.getSalary();
        }
        return total;
    }

    public int getTotalSalaries() {
        return totalSalaries;
    }
}
