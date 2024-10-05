package org.jotaulian.concessionary;

public class Motorbike extends Vehicle {
    private int engineCapacity;
    private boolean hasSidecar;

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }

    public Motorbike(String brand, String model, int year, int engineCapacity, boolean hasSidecar) {
        super(brand, model, year);
        this.engineCapacity = engineCapacity;
        this.hasSidecar = hasSidecar;
    }

    public void wheelie() {
        System.out.println("La " + getBrand() + " " + getModel() + " está haciendo un wheelie!");
    }

    public void putOnHelmet() {
        System.out.println("Poniéndose el casco para montar la " + getBrand() + " " + getModel());
    }

    @Override
    public String toString() {
        return super.toString() + ", Cilindrada: " + engineCapacity + "cc, Tiene sidecar: " + (hasSidecar ? "Sí" : "No");
    }
}