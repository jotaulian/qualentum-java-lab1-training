package org.jotaulian.concessionary;

public class Vehicle {
    private String brand;
    private String model;
    private int year;

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void startEngine() {
        System.out.println("El motor del " + brand + " " + model + " está arrancando.");
    }

    public void accelerate() {
        System.out.println("El " + brand + " " + model + " está acelerando.");
    }

    public void brake() {
        System.out.println("El " + brand + " " + model + " está frenando.");
    }

    @Override
    public String toString() {
        return "Vehículo: " + brand + " " + model + " (" + year + ")";
    }
}