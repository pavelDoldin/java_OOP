package sem_2_2;

public class Dog extends BaseDog implements Runnable{

    @Override
    public void run() {
        System.out.println("Собака бежит ");
    }
}
