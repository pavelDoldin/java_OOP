package sem_4_dz;

import java.util.ArrayList;
import java.util.Random;

public class Box<T extends Fruit> {
    private static Random random = new Random();


    public static Box generateBox(){
        ArrayList fruit = new ArrayList<>();

        fruit.add(random.nextInt(1, 25)); // сколько фруктов в коробке


        System.out.println("фруктов в ящике" + fruit);

        return new Box();
    }

}
