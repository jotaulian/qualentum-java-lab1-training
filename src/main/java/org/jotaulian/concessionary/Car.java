package org.jotaulian.concessionary;

public class Car extends Vehicle {
    private int doors;
    private boolean isConvertible;

    public Car(String brand, String model, int year, int doors, boolean convertible) {
        super(brand, model, year);
        this.doors = doors;
        this.isConvertible = convertible;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public boolean isConvertible() {
        return isConvertible;
    }

    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }


    public void honk() {
        System.out.println("El " + getBrand() + " " + getModel() + " está tocando la bocina");
    }

    public void fastenSeatbelt() {
        System.out.println("Abrochando el cinturón de seguridad en el " + getBrand() + " " + getModel());
    }

    @Override
    public String toString() {
        return super.toString() + ", Puertas: " + doors + ", Convertible: " + (isConvertible ? "Sí" : "No");
    }
}