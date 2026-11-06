package zad2;
public class Building {
    private String address;
    private int floors;
    private double totalArea;

    public Building(String address, int floors, double totalArea) {
        this.address = address;
        this.floors = floors;
        this.totalArea = totalArea;
    }

    public String getAddress() { return address; }
    public int getFloors() { return floors; }
    public double getTotalArea() { return totalArea; }

    @Override
    public String toString() {
        return "Здание [адрес=" + address + ", этажей=" + floors + ", площадь=" + totalArea + " м²]";
    }
}