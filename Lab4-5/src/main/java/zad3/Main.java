package zad3;
public class Main {
    public static void main(String[] args) {
        Car[] cars = {
                new Car("Tesla Model 3", FuelType.ELECTRIC),
                new Car("Toyota Camry", FuelType.PETROL),
                new Car("BMW iX", FuelType.ELECTRIC),
                new Car("Volkswagen Passat", FuelType.DIESEL),
                new Car("Toyota Prius", FuelType.HYBRID)
        };

        System.out.println("Все автомобили ");
        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println("\nЭлектромобили ");
        for (Car car : cars) {
            if (car.getFuelType() == FuelType.ELECTRIC) {
                System.out.println(car);
            }
        }
    }
}