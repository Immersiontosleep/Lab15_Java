package zad2;

public class Main {
    public static void main(String[] args) {
        Building[] buildings = {
                new Building("ул. Ленина, 10", 5, 2500.0),
                new Building("пр. Независимости, 45", 12, 8400.5),
                new Building("ул. Мира, 7", 3, 1200.0),
                new Building("ул. Советская, 22", 9, 5600.0),
                new Building("пр. Победителей, 1", 16, 12000.0),
                new Building("ул. Кирова, 15", 7, 3100.0)
        };

        System.out.println("Все здания");
        for (Building b : buildings) {
            System.out.println(b);
        }
        Building maxFloors = buildings[0];
        for (int i = 1; i < buildings.length; i++) {
            if (buildings[i].getFloors() > maxFloors.getFloors()) {
                maxFloors = buildings[i];
            }
        }
        Building maxArea = buildings[0];
        for (int i = 1; i < buildings.length; i++) {
            if (buildings[i].getTotalArea() > maxArea.getTotalArea()) {
                maxArea = buildings[i];
            }
        }

        System.out.println("\nРезультт");
        System.out.println("Здание с макс. кол-вом этажей: " + maxFloors);
        System.out.println("Здание с макс. площадью:      " + maxArea);
    }
}