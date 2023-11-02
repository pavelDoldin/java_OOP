package sem_3_1;

public class Dog extends Animal{
    public Dog(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
        counter++;
    }
    private static int counter;

    public static int getCounter() {
        return counter;
    }
}
