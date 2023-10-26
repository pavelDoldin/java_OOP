package dz_2;


import java.util.ArrayList;


public class MainClass {
    public static void main(String[] args) {
        Cat cat0 = new Cat("Barsik", 100, 0);
        Cat cat1 = new Cat("Уголёк", 0, 100);
        Cat cat2 = new Cat("Рыжая", 30, -70);
        Cat cat3 = new Cat("Шельма", -5, 95);
        Cat cat4 = new Cat("Макс", 50, 50);
        Cat cat5 = new Cat("Шторм", 51, 49);

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(cat0);
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        cats.add(cat5);

        for (Cat cat : cats) {
            Plate plate = new Plate(50);
            plate.info();
            plate.getFood();
            cat.eat(plate);
            plate.setFood(plate.getFood() - cat.getAppetite());
        }

    }
}
