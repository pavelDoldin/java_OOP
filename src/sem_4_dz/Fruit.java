package sem_4_dz;

public abstract class Fruit {
    /**
     * Вес фрукта
     */
    protected final float weight;


    public float getWeight() {
        return weight;
    }


    public Fruit(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return String.format("Вес фрукта %.2f", weight);
    }
}
