package sem_6.task_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Кводрат
 */
public class Square {

    /**
     * Точки квадрата
     */
    private List<Point> points;

    /**
     * Сторона квадрата
     */
    private int side;

    public int getSide() {
        return side;
    }

    /**
     * Маштаб
     */
    //private int scale = 1;



    //public int getScale() {
    //    return scale;
    //}
//
    //public void setScale(int scale) {
    //    this.scale = scale;
    //}

    public Square(Point point1, int side) {
        this.side = side;

        Point point2 = new Point(point1.getX() + side, point1.getY());
        Point point3 = new Point(point1.getX() + side, point1.getY() + side);
        Point point4 = new Point(point1.getX(), point1.getY() + side);

        points = new ArrayList<>();
        points.add(point1);
        points.add(point2);
        points.add(point3);
        points.add(point4);

    }

    /**
     * Найти площадь квадрата
     * @return
     */
    public int getArea(){
        return side * side;
    }

    /**
     * Нарисовать квадрат в консоли
     */
    /*
    public void draw(){
        for (int i = 0; i < side * scale * 2; i++){
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < side * scale -2; i++){
            System.out.print("*");
            for (int j = 1; j < side * scale *2 -1; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }

        for (int i = 0; i < side * scale *2; i++){
            System.out.print("*");
        }
    }

     */
}

















