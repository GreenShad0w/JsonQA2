package org.example;

import java.util.List;

public class Company {
    private String company;
    private List<Employee> employees;
    private Location location;
    private int established;

    // Геттеры
    public String getCompany() {
        return company;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public Location getLocation() {
        return location;
    }

    public int getEstablished() {
        return established;
    }

    // Сеттеры
    public void setCompany(String company) {
        this.company = company;
    }

}