package sem_3_1;

public class Cat extends Animal{
    public Cat(String name, int maxRun, int maxSwim) {
        super(name, maxRun, maxSwim);
        counter++;
    }

    private static int counter;

    public static int getCounter() {
        return counter;
    }

    @Override
    public void swin(int distance) {
        System.out.printf("%s не умеет плавать \n", name);
    }
}
