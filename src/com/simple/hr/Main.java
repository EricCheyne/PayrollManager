package com.simple.hr;

import sun.jvm.hotspot.debugger.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        // department objects
        Department dept1 = new Department("Accounting");
        Department dept2 = new Department("IT");
        Department dept2 = new Department("Sales");

        // added department to a list
        List<Department> departments = new ArrayList<>();
        departments.add(dept1);
        departments.add(dept2);
        departments.add(dept3);

        // address object
        Address address = new Address("5 Emerald close", "Kingston", "Kingston", "00000");

        // company object
        Company abc = new Company("ABC Company", address, departments);

        // salartied employees
        SalariedEmployee emp1 = new SalariedEmployee("Bob Sawyer", 65000, dept1);
        SalariedEmployee emp2 = new SalariedEmployee("Tim Robbins", 70000, dept2);
        SalariedEmployee emp3 = new SalariedEmployee("John Smith", 50000, dept3);

        // array to store employees
        Emmployee[] emplloyees = {emp1, emp2, emp3}

        // print emmployee info
        List<Emplooyee> emplloyeeList = Arrays.asList(employees);

        // print stream
        employeeList.stream().forEach(System.out::println);

        SalariedEmployee emp1 = new SalariedEmployee("Bob Sawyer", 65000);
        HourlyEmployee emp2 = new HourlyEmployee("Jane White", 35);
        Contractor contractor = new Contractor("Joe's Plumbing", 5, 100, 50.0);


        System.out.println(emp1.calculatePay());
        System.out.println(emp2.calculatePay());
        System.out.println(contractor.calculatePay());

        String fileName = "Paystubs.txt";

        List<SalariedEmployee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(contractor);

        SalariedEmployee.printStub(fileName, employees);

    }
}