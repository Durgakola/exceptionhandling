package com.neoteric.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CompanyTest {
    public static void main(String[] args) {

        Department itDepartment = new Department();
        itDepartment.setName("IT Department ");

        Employee durga = new Employee();
        durga.setEmployeeName("Durga");
        durga.setSalary(35000.0);
        durga.setEmployeeId(1);

        Employee kusuma = new Employee();
        kusuma.setEmployeeName("Kusuma");
        kusuma.setSalary(25000.0);
        kusuma.setEmployeeId(2);

        itDepartment.add(durga);
        itDepartment.add(kusuma);


        Department hrDepartment = new Department();
        hrDepartment.setName(" HR Department");

        Employee rachana = new Employee();
        rachana.setEmployeeName("Rachana");
        rachana.setSalary(20000.0);
        rachana.setEmployeeId(3);

        Employee saraswathi = new Employee();
        saraswathi.setEmployeeName("Saraswathi");
        saraswathi.setSalary(30000.0);
        saraswathi.setEmployeeId(4);

        hrDepartment.add(rachana);
        hrDepartment.add(saraswathi);


        Department finance = new Department();
        finance.setName(" Finance Department ");

        Employee ayappa = new Employee();
        ayappa.setEmployeeName("Ayappa");
        ayappa.setSalary(80000.0);
        ayappa.setEmployeeId(5);

        Employee dileep = new Employee();
        dileep.setEmployeeName("Dileep");
        dileep.setSalary(85000.0);
        dileep.setEmployeeId(6);

        finance.add(ayappa);
        finance.add(dileep);


        List<Department> departments = new ArrayList<>();
        departments.add(itDepartment);
        departments.add(hrDepartment);
        departments.add(finance);

        Optional<Employee> companyMaxSalaryEmployee = departments.stream()
                .flatMap(department -> department.getEmployeeList().stream())
                .max((o1, o2) -> o1.compareTo(o2));//  company Max salary

        companyMaxSalaryEmployee.ifPresent(employee ->
                System.out.println("Company-wise Max Salary: " + employee));


        //Calculate department-wise maximum salary using Comparable
        departments.forEach(department -> {
            Optional<Employee> maxSalaryEmployee = department.getEmployeeList().stream()
                    .max((o1, o2) -> o1.compareTo(o2));

            maxSalaryEmployee.ifPresent(employee -> {
                System.out.println("Department: " + department.getName());
                System.out.println("Max Salary Employee:" + employee);
            });
        });

        Optional<Employee> companyMaxSalaryEmployee1 = departments.stream()
                .flatMap(department -> department.getEmployeeList().stream())
                .min((o1, o2) -> o2.compareTo(o2)); //company max salary

        companyMaxSalaryEmployee1.ifPresent(employee ->
                System.out.println("Company minimum Salary: " + employee));


        // Calculate department-wise maximum salary using Comparable
        departments.forEach(department -> {
            Optional<Employee> maxSalaryEmployee = department.getEmployeeList().stream()
                    .min((o1, o2) -> o1.compareTo(o2));

            maxSalaryEmployee.ifPresent(employee -> {
                System.out.println("Department: " + department.getName());
                System.out.println("  minimum Salary Employee: " + employee);
            });
        });
    }
}
