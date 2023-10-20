package sem_2_1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Чёрный");
        cat1.setName("Макс");
        Dog dog2 = new Dog(12);
        dog2.setName("Шарик");
        //System.out.println(cat1.getName());
        //cat1.voice();
        //System.out.println("-----------------");
        //System.out.println(dog2.getName());
        //dog2.voice();

        List<Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(dog2);

        processVoice(animals);
    }

    static void processVoice(List<Animal> animals){
        for (Animal animal : animals) {
            if (animal instanceof Cat){
                Cat cat = (Cat)animal;
                Animal a1 = cat;
                cat.jump();
                System.out.println("Цвет котика: " + cat.getColor());
            }
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                System.out.println("Вес собаки: " + dog.getWeight());

            }
            animal.voice();
        }
    }
}











