package sem_6.task_4;

public class Birt {

    private int flySpeed = 25;

    protected boolean canFly = true;

    public int getFlySpeed() {
        return flySpeed;
    }

    public boolean isCanFly() {
        return canFly;
    }

    public void fly(){
        System.out.printf("Птица летит со скоросью %d км/ч\n", flySpeed);
    }
}
