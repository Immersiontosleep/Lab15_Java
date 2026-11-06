package org.example;

public class Tree extends Plant {

    private double crownDiameter;

    public Tree(String name, double height, String type, double crownDiameter) {
        super(name, height, type);
        this.crownDiameter = crownDiameter;
    }

    public double getCrownDiameter() {
        return crownDiameter;
    }

    public void setCrownDiameter(double crownDiameter) {
        this.crownDiameter = crownDiameter;
    }

    @Override
    public void grow() {
        System.out.println(getName() + " растет медленно");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("    Диаметр кроны: " + crownDiameter + " м");
    }

    public void cutDown() {
        System.out.println("Дерево \"" + getName()
                + "\" срублено. Диаметр кроны: " + crownDiameter + " м.");
    }
}