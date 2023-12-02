package sem_6.task_3;

import java.util.List;

/**
 * Посчитает общую площадь всех фигур
 */
public class CalcAreaService {

    private List<Shape> shapes;

    public List<Shape> getShapes() {
        return shapes;
    }

    public CalcAreaService(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public void processAll(){
        double sumArea = 0;
        for (Shape shape : shapes) {
            if (shape instanceof  RightTriangle){
                RightTriangle triangle = (RightTriangle) shape;
                sumArea += triangle.getKatet1() * triangle.getKatet2() / 2.0;
            }
            if (shape instanceof Square){
                Square square = (Square) shape;
                sumArea += Math.pow(square.getSide(), 2);
            }
            if (shape instanceof Circle){
                Circle circle = (Circle) shape;
                sumArea += Math.PI * circle.getRadius() * circle.getRadius();
            }
        }
        System.out.printf("Сумма площадей фигур ровна %f \n", sumArea);
    }

}









