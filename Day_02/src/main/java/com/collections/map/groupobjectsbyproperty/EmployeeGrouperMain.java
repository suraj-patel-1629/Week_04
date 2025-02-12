/*Group Objects by Property
Given a list of Employee objects, group them by their department using a Map<Department, List<Employee>>.
Example:
Employees: [Alice (HR), Bob (IT), Carol (HR)] → Output: HR: [Alice, Carol], IT: [Bob].*/
package com.collections.map.groupobjectsbyproperty;

import java.util.*;
public class EmployeeGrouperMain {
    public static void main(String[] args) {
        // Creating a list of employees
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        // Grouping employees by department
        Map<String, List<Employee>> groupedEmployees = EmployeeGrouper.groupByDepartment(employees);

        // Printing the grouped employees
        groupedEmployees.forEach((department, empList) ->
                System.out.println(department + ": " + empList));
    }
}
