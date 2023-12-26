package oopDop.cars;

public class Audi extends Car {

    /**
     * Максимальная скорость
     */
    private int maxSpeed;

    private static int count;


    public Audi(String name, String surName, int power, int maxSpeed) {
        super(name, surName, power);
        this.maxSpeed = maxSpeed;
        count++;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }

    public static int getCount() {
        return count;
    }

    @Override
    public String toString() {
        return String.format("Марка: %s, модель: %s, мощность: %d, макс скорость: %d\n",
                name, surName, power, maxSpeed);
    }
}








