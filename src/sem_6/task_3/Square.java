package sem_6.task_3;

/**
 * Квадрат
 */
public class Square implements Shape {

    /**
     * Сторона
     */
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }
}
