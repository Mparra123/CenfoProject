package com.mparra.parra.model;

public class Property {
    
    private String title;
    private String description;
    private String type;
    private String location;
    private double price;
    private String caracter;
    private String contact;

    public Property() {
    }

    public Property(String title, String description, String type, String location, double price, String caracter, String contact) {
        this.title = title;
        this.description = description;
        this.type = type;
        this.location = location;
        this.price = price;
        this.caracter = caracter;
        this.contact = contact;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCaracter() {
        return caracter;
    }

    public void setCaracter(String caracter) {
        this.caracter = caracter;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
}
