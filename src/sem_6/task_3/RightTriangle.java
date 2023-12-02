package sem_6.task_3;

public class RightTriangle implements Shape {

    private int katet1;
    private int katet2;
    private double qipotenuza;

    public RightTriangle(int katet1, int katet2) {
        this.katet1 = katet1;
        this.katet2 = katet2;
        this.qipotenuza = Math.sqrt(Math.pow(katet1, 2) + Math.pow(katet2, 2));
    }

    public int getKatet1() {
        return katet1;
    }

    public int getKatet2() {
        return katet2;
    }

    public double getQipotenuza() {
        return qipotenuza;
    }
}
