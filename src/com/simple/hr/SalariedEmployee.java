package com.simple.hr;

import sun.jvm.hotspot.debugger.*;

import java.text.*;

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
        Address address = new Address("5 Emerald Close", "Kinston", "Kington", "00000");
        Company company = new Company("ABC Company", address);

        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy");
        String strDate = format.format(date);

        String outStr;
        outStr = "\t\t" + company.getName() +
                "\n\t" + "Name: " + getName() + "  -Employee Id: " + getEmployeeID() +
                "\n\t " + "Pay Date \t " + strDate +
                "\n\t " + "Net Salary $" + salary +
                "\n\t" + "Gross Salary $" + calculatePay();

        return outStr;
    }
}
