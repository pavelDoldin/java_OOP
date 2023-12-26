package oopDop.cars;

public abstract class Car {

    /**
     * Марка автомобиля
     */
    protected String name;
    /**
     * Модель автомобиля
     */
    protected String surName;

    /**
     * Мошбность автомобиля в лошадинных силах
     */
    protected int power;

    private static int count;



    public Car(String name, String surName, int power) {
        this.name = name;
        this.surName = surName;
        this.power = power;
        count++;
    }

    public static int getCount() {
        return count;
    }
    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return String.format("Марка: %s, модель: %s, мощность: %d\n",
                name, surName, power);
    }
}
