package com.simple.hr;

public class Main {
    public static void main(String[] args) {

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