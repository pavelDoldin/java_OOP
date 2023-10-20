package sem_2_2;

public class Cat extends BaseCat implements Runnable{

    @Override
    public void run() {
        System.out.println("Кошка бежит ");
    }
}
