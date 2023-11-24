package sem_4_dz;

public class Apple extends Fruit{

    private int weightBox;

    public Apple() {
        super(1.0f);
        this.weightBox = (int) getWeight();
    }


    public int getWeightBox() {
        return weightBox;
    }

    @Override
    public String toString() {
        return String.format("Фруктов в ящике %s", weightBox);
    }
}
