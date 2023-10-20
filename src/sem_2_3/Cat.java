package sem_2_3;

public class Cat extends BaseCat implements Runner{

    private String name;
    private int maxRun;
    private int maxJump;


    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxJump() {
        return maxJump;
    }

    public Cat(String name, int maxRun, int maxJum) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJum;
    }


    @Override
    public boolean run(int length) {
        if (length <= getMaxRun()){
            System.out.printf("%s пробежал по беговой дорожке %d метров\n", name, length);
            return true;
        }
        else {
            System.out.printf("%s не пробежал по беговой дорожке %d метров, остановился %d\n", name, length,getMaxRun());
            return false;
        }

    }

    @Override
    public boolean jump(int height) {
        if (height <= getMaxJump()){
            System.out.printf("%s перепрыгнул %d см.\n", name, height);
            return true;
        }
        else {
            System.out.printf("%s не перепрыгнул %d см., остановился на месте \n", name, height);
            return false;
        }
    }
}
