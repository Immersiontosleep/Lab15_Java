package org.example;

class Airplane {

    private final String model;
    private final int capacity;
    private final int range;

    private static int totalPlanes = 0;
    private static int totalCapacity = 0;

    public Airplane(String model, int capacity, int range) {
        this.model = model;
        this.capacity = capacity;
        this.range = range;
        totalPlanes++;
        totalCapacity += capacity;
    }

    public String getModel() {
        return model;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRange() {
        return range;
    }

    public static double getAverageCapacity() {
        if (totalPlanes == 0) {
            return 0;
        }
        return (double) totalCapacity / totalPlanes;
    }

    public static int getTotalPlanes() {
        return totalPlanes;
    }

    public static int getTotalCapacity() {
        return totalCapacity;
    }
}
