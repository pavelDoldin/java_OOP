package sem_6.task_4;

public class Penguin extends Birt {

    public Penguin() {

        canFly = false;

    }

    @Override
    public void fly() {
        System.out.printf("Пингвин не умеет литать (");
    }
}
