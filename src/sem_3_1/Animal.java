package sem_3_1;

public abstract class Animal {
    protected String name;
    protected int maxRun;
    protected int maxSwim;
    private static int counter;


    public Animal(String name, int maxRun, int maxSwim) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        counter ++;
    }


    public void run (int distance){
        if (distance <= maxRun){
            System.out.printf("%s пробежал %d метров \n", name, distance);
        }
        else {
            System.out.printf("%s не пробежал %d метров \n" , name, distance);
        }
    }

    public void swin (int distance){
        if (distance <= maxSwim){
            System.out.printf("%s пероплыл %d метров \n", name, distance);
        }
        else {
            System.out.printf("%s не проплыл %d метров \n", name, distance);
        }
    }

    public static int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public int getMaxRun() {
        return maxRun;
    }

    public int getMaxSwim() {
        return maxSwim;
    }
}
