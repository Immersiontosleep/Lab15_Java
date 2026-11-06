package zad3;

public class Car {
    private String model;
    private FuelType fuelType;

    public Car(String model, FuelType fuelType) {
        this.model = model;
        this.fuelType = fuelType;
    }

    public String getModel() { return model; }
    public FuelType getFuelType() { return fuelType; }

    @Override
    public String toString() {
        return "Автомобиль [модель=" + model + ", топливо=" + fuelType + "]";
    }
}