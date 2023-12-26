package oopDop.cars;

public class Vaz extends Car {


    private String color;
    private static int count;

    public Vaz(String name, String surName, int power, String color) {
        super(name, surName, power);
        this.color = color;
        count++;
    }

    public static int getCount() {
        return count;
    }
    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return String.format("Марка: %s, модель: %s, мощность: %d, цвет: %s\n",
                name, surName, power, color);
    }
}










