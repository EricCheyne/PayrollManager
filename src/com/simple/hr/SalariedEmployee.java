package com.simple.hr;

public class SalariedEmployee extends Employee {

    private double salary;

    public SalariedEmployee(String name) {
        super(name);
    }

    public SalariedEmployee(String name, double sal) {
        super(name);
        this.salary = sal;
    }

    @Override
    public double calculatePay() {
        return this.salary - (this.salary * 0.3);
    }

    @Override
    public String generatePayStub() {
        return null;
    }
}
