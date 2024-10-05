package org.jotaulian;

import org.jotaulian.concessionary.Car;
import org.jotaulian.concessionary.Motorbike;
import org.jotaulian.concessionary.Vehicle;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Vehicle> vehicles = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Añadir vehículo");
            System.out.println("2. Mostrar inventario");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        addVehicle();
                        break;
                    case 2:
                        showInventory();
                        break;
                    case 3:
                        running = false;
                        System.out.println("Cerrando el programa ¡Hasta luego!");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Por favor, introduzca un número válido.");
                scanner.nextLine(); // Clear the invalid input
            }
        }
        scanner.close();
    }

    private static void addVehicle() {
        System.out.println("\n--- Añadir Vehículo ---");
        System.out.println("1. Añadir Coche");
        System.out.println("2. Añadir Motocicleta");
        System.out.print("Seleccione el tipo de vehículo: ");

        try {
            int choice = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Marca: ");
            String brand = scanner.nextLine();
            System.out.print("Modelo: ");
            String model = scanner.nextLine();
            System.out.print("Año: ");
            int year = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addCar(brand, model, year);
                    break;
                case 2:
                    addMotorbike(brand, model, year);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Entrada no válida. Volviendo al menú principal.");
            scanner.nextLine(); // Clear the invalid input
        }
    }

    private static void addCar(String brand, String model, int year) {
        System.out.print("Número de puertas: ");
        int doors = scanner.nextInt();
        System.out.print("¿Es convertible? (true/false): ");
        boolean convertible = scanner.nextBoolean();

        Car car = new Car(brand, model, year, doors, convertible);
        vehicles.add(car);
        System.out.println("Coche añadido.");
    }

    private static void addMotorbike(String brand, String model, int year) {
        System.out.print("Cilindrada del motor: ");
        int engineCapacity = scanner.nextInt();
        System.out.print("¿Tiene sidecar? (true/false): ");
        boolean hasSidecar = scanner.nextBoolean();

        Motorbike motorbike = new Motorbike(brand, model, year, engineCapacity, hasSidecar);
        vehicles.add(motorbike);
        System.out.println("Motocicleta añadida.");
    }

    private static void showInventory() {
        if (vehicles.isEmpty()) {
            System.out.println("No hay vehículos.");
        } else {
            System.out.println("\n--- Inventario de Vehículos ---");
            for (Vehicle vehicle : vehicles) {
                System.out.println(vehicle);
            }
        }
    }
}