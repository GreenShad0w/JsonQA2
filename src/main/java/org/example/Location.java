package org.example;

public class Location {
    private String address;
    private String city;
    private String state;
    private String zip;

    // Геттеры
    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    // Сеттеры (необязательно для текущей задачи, но рекомендуется)
    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}