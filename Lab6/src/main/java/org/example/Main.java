package org.example;

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Шарик", "Дворняга", 3);
        myDog.bark();
        System.out.println("Имя: " + myDog.getName());
        System.out.println("Порода: " + myDog.getBreed());
        System.out.println("Возраст: " + myDog.getAge());
    }
}