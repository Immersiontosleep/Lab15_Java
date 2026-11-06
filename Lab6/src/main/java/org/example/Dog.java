package org.example;

import com.sun.tools.jconsole.JConsoleContext;

public class Dog {
    private String name;
    private String breed;
    private int age;
    private static int foot;
    private int feet;

    public Dog(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    public int getFoot(){
        return foot;
    }
    public int getFeet(){
        return feet;
    }

    public Dog(String name, String breed, int age, int foot) {
        this(name,breed,age);
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Возраст не может быть отрицательным!");
        }
    }

    public void bark() {
        System.out.println("Гав!");
    }
}

