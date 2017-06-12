package com.epam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeesPerDepartmentVisitor implements Visitor {

    Map<Department, Integer> employeesPerDepartment = new HashMap<Department, Integer>();

    public void visit(Company company) {
        List<Employee> employees = company.getEmployees();

        for (Employee e : employees) {
            Integer employeesNumber = employeesPerDepartment.get(e.getDepartment());
            if (employeesNumber == null) {
                employeesNumber = 0;
            }
            employeesNumber++;
            employeesPerDepartment.put(e.getDepartment(), employeesNumber);
        }
    }

    public Map<Department, Integer> getEmployeesPerDepartment() {
        return employeesPerDepartment;
    }
}
