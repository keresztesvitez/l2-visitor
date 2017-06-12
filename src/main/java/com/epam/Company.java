package com.epam;

import java.util.ArrayList;
import java.util.List;

public class Company implements Visitable {
    private List<Employee> employees;

    public Company(List<Employee> employees) {
        this.employees = employees;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Company{" +
                "employees=" + employees +
                '}';
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
