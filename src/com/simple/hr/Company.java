package com.simple.hr;

import java.util.*;

public class Company {
    private String name;
    private Address address;
    private List<Department> departments;

    public Company(String n, Address addr) {
        this.name = n;
        this.address = addr;
    }

    public String getName() {
        return name;
    }

    public void getAddress() {
        address.getAddress();
    }

    public List<Department> getDepartments() {
        return departments;
    }

}
