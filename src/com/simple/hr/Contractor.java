package com.simple.hr;

public class Contractor implements Payable {

    private String employerName;
    private int hoursWorked;
    private double partsCost;
    private double hourlyRate;

    public Contractor(String name, int hours, double parts, double rate) {
        this.employerName = name;
        this.hoursWorked = hours;
        this.partsCost = parts;
        this.hourlyRate = rate;
    }

    @Override
    public double calculatePay() {
        return this.hoursWorked * this.hourlyRate + this.partsCost;
    }

    @Override
    public String generatePayStub() { // invoice
        return null;
    }
}
