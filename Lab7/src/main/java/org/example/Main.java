package org.example;

public class Main {
    public static void main(String[] args) {
        Airplane plane1 = new Airplane("Boeing 737", 150, 5000);
        Airplane plane2 = new Airplane("Airbus A320", 180, 6000);
        Airplane plane3 = new Airplane("Boeing 777", 350, 14000);

        System.out.println("AvgCapacity " + Airplane.getAverageCapacity());
        }
    }
