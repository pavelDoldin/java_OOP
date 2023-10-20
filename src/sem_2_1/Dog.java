package sem_2_1;

public class Dog extends Animal{

    private double weight; // вес

    public double getWeight() {
        return weight;
    }



    public Dog(double weight) {
        this.weight = weight;
    }

    @Override
    public void voice() {
        System.out.println("Гав гав");
    }

    @Override
    public void jump() {
        System.out.println("Собака прыгает");
    }
}
