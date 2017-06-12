package com.epam;

import java.util.List;

public class NumberOfEmployeesVisitor implements Visitor {

    private int numberOfEmployees = 0;

    public void visit(Company company) {
        List<Employee> employees = company.getEmployees();
        numberOfEmployees = employees.size();
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }
}
