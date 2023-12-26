package oopDop.cars;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        Car[] cars = {
                new Audi("Audi", "TT", 280, 300),
                new Vaz("Лада", "Гранта", 105, "Коричневый"),
                new Audi("Audi", "Qadro", 180, 230),
                new Vaz("Лада", "Веста", 105, "Белый"),
                new Audi("Audi", "3", 350, 320),
                new Vaz("Лада", "Нива", 105, "Чёрный"),
        };

        for (Car car : cars){
            System.out.println(car);
        }

        System.out.println("-------------------------");
        System.out.println("Созданно машин: " + Car.getCount());
        System.out.println("Созданно Audi: " + Audi.getCount());
        System.out.println("Создано Ваз: " + Vaz.getCount());

        //List<Car> cars = new ArrayList<>();
        //cars.add(new Audi("Audi", "TT", 280, 300));
        //cars.add(new Vaz("Лада", "Гранта", 105, "Коричневый"));
        //cars.add(new Audi("Audi", "Qadro", 180, 230));
        //cars.add(new Vaz("Лада", "Веста", 105, "Белый"));
        //cars.add(new Audi("Audi", "3", 350, 320));
        //cars.add(new Vaz("Лада", "Нива", 105, "Чёрный"));

        //for (Car car : cars) {
        //    System.out.println(car);
        //}
        //System.out.println(cars);

    }


}
