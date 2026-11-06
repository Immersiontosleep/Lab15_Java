package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        Plant[] plants = new Plant[5];

        plants[0] = new Tree("Дуб", 25.0, "Лиственное", 12.0);
        plants[1] = new Tree("Береза", 18.0, "Лиственное", 6.5);
        plants[2] = new Tree("Сосна", 30.0, "Хвойное", 8.0);
        plants[3] = new Flower("Роза", 0.8, "Многолетнее", "Красный");
        plants[4] = new Flower("Тюльпан", 0.4, "Однолетнее", "Желтый");

        System.out.println("Растения");
        for (Plant plant : plants) {
            plant.displayInfo();
            System.out.println();
        }

        System.out.println("Рост растений");
        for (Plant plant : plants) {
            plant.grow();
        }

        System.out.println();
        System.out.println("Методы");
        for (Plant plant : plants) {
            if (plant instanceof Tree) {
                Tree tree = (Tree) plant;
                tree.cutDown();
            } else if (plant instanceof Flower) {
                Flower flower = (Flower) plant;
                flower.bloom();
            }
        }

        System.out.println();
        System.out.println("Get Set");

        plants[0].setHeight(plants[0].getHeight() + 0.5);
        System.out.println("Высота дуба после обновления: "
                + plants[0].getHeight() + " м");

        Tree birch = (Tree) plants[1];
        birch.setCrownDiameter(birch.getCrownDiameter() + 0.5);
        System.out.println("Диаметр кроны березы после обновления: "
                + birch.getCrownDiameter() + " м");

        Flower rose = (Flower) plants[3];
        rose.setBloomColor("Бордовый");
        System.out.println("Цвет цветения розы после обновления: "
                + rose.getBloomColor());
    }
}