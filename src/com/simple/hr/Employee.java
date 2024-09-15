package com.simple.hr;

public abstract class Employee implements Payable {

    public static double STARTING_PAY_RATE = 7.75;
    private static int nextID = 1000;
    private final int EMPLOYEE_ID;
    private String name;
    private double payRate;
    private Address address;

    public Employee(String name) {
        this.name = name;
        EMPLOYEE_ID = getNextID();
        payRate = STARTING_PAY_RATE;

    }

    public void setAddress(Address addr) {
        address = addr;
    }

    public static int getNextID() {
        int id = nextID;
        nextID++;
        return id;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeID() {
        return EMPLOYEE_ID;
    }

    public double getPayRate() {
        return payRate;
    }

    public void changeName(String newName) {
        name = newName;
    }

    public void changePayRate(double newRate) {
        payRate = newRate;
    }

    public void displayAddress() {
        address.getAddress();
    }
}
