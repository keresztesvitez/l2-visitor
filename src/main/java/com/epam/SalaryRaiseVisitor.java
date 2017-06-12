package com.epam;

import java.util.List;

public class SalaryRaiseVisitor implements Visitor {

    private static final double RAISE_PERCENTAGE = 1.1;
    private List<Employee> employees;

    public void visit(Company company) {
        employees = company.getEmployees();

        for (Employee e : employees) {
            e.setSalary(e.getSalary() * RAISE_PERCENTAGE);
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}
