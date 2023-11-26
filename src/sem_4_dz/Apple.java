package sem_4_dz;

import java.util.ArrayList;
import java.util.Random;

public class Apple extends Fruit {

    protected int weightBox;

    public int getWeightBox() {
        return weightBox;
    }

    public Apple(float weight, int weightBox) {
        super(weight);
        this.weightBox = weightBox;
    }

    public Apple() {
        super(1.0f);
        this.weightBox = (int) getWeight();
    }


    @Override
    public String toString() {
        return String.format("Вес яблока %d", weightBox);
    }
}
